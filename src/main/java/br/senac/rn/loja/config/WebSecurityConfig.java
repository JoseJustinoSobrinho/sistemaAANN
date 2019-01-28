package br.senac.rn.loja.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.senac.rn.loja.service.UsuarioService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UsuarioService usuarioDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/login", "/fotos/**", "/css/**", "/js/**", "/fonts/**").permitAll()
	//	.antMatchers("/login", "/css/**", "/js/**", "/fonts/**", "/marca/**").permitAll()
		.antMatchers("/produto/**").hasRole("FUNCIONARIO")
		.antMatchers("/departamento/**").hasRole("USER")
		.antMatchers("/usuario/**").hasRole("ADMIN")
	//	.antMatchers("/usuario/**", "/departamento/**").hasRole("ADMIN")
	//	.anyRequest().authenticated()   // tirando fica tudo liberado OBESERVE que marca ta liberado
		.and()
		.formLogin()
			.loginPage("/login").successForwardUrl("/marca")   /// quando rodar o login vai pra essa pagina
			.defaultSuccessUrl("/marca", true).permitAll();
	//	super.configure(http);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(usuarioDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/api/**");
	}
	
}

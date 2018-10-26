package br.senac.rn.loja.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.senac.rn.loja.model.Usuario;
import br.senac.rn.loja.repository.UsuarioRepository;

@Component
@Service
@Transactional
public class UsuarioService extends GenericService<Usuario> implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuario usuario = new Usuario();
		List<GrantedAuthority> autorizacoes = AuthorityUtils.createAuthorityList("ROLE_USER");
		if (login.equalsIgnoreCase("admin")) {
			usuario.setLogin("admin");
			usuario.setSenha("admin");
			autorizacoes = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
		} else {
			usuario = usuarioRepository.findByLogin(login);
			autorizacoes = AuthorityUtils.createAuthorityList("ROLE_USER");
			if (usuario == null) {
				throw new UsernameNotFoundException("Usuario não encontrado");
			}
		}
		return new User(usuario.getLogin(), usuario.getSenha(), autorizacoes);
	}

}

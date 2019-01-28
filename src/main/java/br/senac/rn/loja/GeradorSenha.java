package br.senac.rn.loja;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorSenha {

	public static void main(String[] args) {
		System.out.println("=====================================================");
		System.out.println("Senha: " + new BCryptPasswordEncoder().encode("ana"));
		System.out.println("=====================================================");
	}
	
}

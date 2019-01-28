package br.senac.rn.loja.repository;


import br.senac.rn.loja.model.Usuario;

public interface UsuarioRepository extends GenericRepository<Usuario> {

	Usuario findByLogin(String login);
	
}

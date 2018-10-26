package br.senac.rn.loja.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.senac.rn.loja.model.Usuario;

public interface UsuarioRepository extends GenericRepository<Usuario> {

	Usuario findByLogin(String login);
	
}

package br.senac.rn.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.rn.loja.model.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController extends GenericController<Usuario> {

	@Override
	public Class<Usuario> getClassType() {
		return Usuario.class;
	}

}

package br.senac.rn.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.rn.loja.model.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController extends GenericController<Cliente> {

	@Override
	public Class<Cliente> getClassType() {
		return Cliente.class;
	}

}

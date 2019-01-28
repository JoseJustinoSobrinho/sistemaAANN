package br.senac.rn.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.rn.loja.model.Permissao;


@Controller
@RequestMapping("/permissao")
public class PermissaoController extends GenericController<Permissao> {

	@Override
	public Class<Permissao> getClassType() {
		return Permissao.class;
	}

}

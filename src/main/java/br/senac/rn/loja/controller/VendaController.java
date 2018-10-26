package br.senac.rn.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.rn.loja.model.Venda;

@Controller
@RequestMapping("/venda")
public class VendaController extends GenericController<Venda> {

	@Override
	public Class<Venda> getClassType() {
		return Venda.class;
	}

}

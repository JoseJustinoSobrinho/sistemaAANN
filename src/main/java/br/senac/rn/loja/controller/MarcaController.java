package br.senac.rn.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.rn.loja.model.Marca;

@Controller
@RequestMapping("/marca")
public class MarcaController extends GenericController<Marca> {

	@Override
	public Class<Marca> getClassType() {
		return Marca.class;
	}
	
}

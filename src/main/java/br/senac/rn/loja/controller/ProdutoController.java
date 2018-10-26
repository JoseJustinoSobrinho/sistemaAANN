package br.senac.rn.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senac.rn.loja.model.Produto;
import br.senac.rn.loja.service.DepartamentoService;
import br.senac.rn.loja.service.MarcaService;

@Controller
@RequestMapping("/produto")
public class ProdutoController extends GenericController<Produto> {

	@Autowired
	private MarcaService marcaService;
	@Autowired
	private DepartamentoService departamentoService;
	
	@Override
	public Class<Produto> getClassType() {
		return Produto.class;
	}
	
	@Override
	public String cadastrar(Model model) {
		model.addAttribute("marcas", marcaService.obterTodos());
		model.addAttribute("departamentos", departamentoService.obterTodos());
		return super.cadastrar(model);
	}
	
}

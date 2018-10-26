package br.senac.rn.loja.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.rn.loja.model.Produto;

@RestController
@RequestMapping("/api/produto")
public class ProdutoRest extends GenericRest<Produto> {}

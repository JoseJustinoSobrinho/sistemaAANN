package br.senac.rn.loja.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.rn.loja.model.Venda;

@RestController
@RequestMapping("/api/venda")
public class VendaRest extends GenericRest<Venda> {}

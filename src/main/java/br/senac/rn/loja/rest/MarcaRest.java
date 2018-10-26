package br.senac.rn.loja.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.rn.loja.model.Marca;

@RestController
@RequestMapping("/api/marca")
public class MarcaRest extends GenericRest<Marca> {}

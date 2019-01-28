package br.senac.rn.loja.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.rn.loja.model.Permissao;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoRest extends GenericRest<Permissao> {}

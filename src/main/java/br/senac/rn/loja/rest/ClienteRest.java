package br.senac.rn.loja.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.rn.loja.model.Cliente;

@RestController
@RequestMapping("/api/cliente")
public class ClienteRest extends GenericRest<Cliente> {}

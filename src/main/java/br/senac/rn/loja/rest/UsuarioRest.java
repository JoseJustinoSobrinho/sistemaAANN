package br.senac.rn.loja.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.rn.loja.model.Usuario;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRest extends GenericRest<Usuario> {}

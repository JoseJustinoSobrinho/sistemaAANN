package br.senac.rn.loja.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.rn.loja.model.Departamento;

@RestController
@RequestMapping("/api/departamento")
public class DepartamentoRest extends GenericRest<Departamento> {}

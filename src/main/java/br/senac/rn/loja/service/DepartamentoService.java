package br.senac.rn.loja.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senac.rn.loja.model.Departamento;

@Service
@Transactional
public class DepartamentoService extends GenericService<Departamento> {}

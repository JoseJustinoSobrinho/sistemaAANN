package br.senac.rn.loja.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senac.rn.loja.model.Venda;

@Service
@Transactional
public class VendaService extends GenericService<Venda> {}

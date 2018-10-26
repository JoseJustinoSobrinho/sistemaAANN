package br.senac.rn.loja.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senac.rn.loja.model.Cliente;

@Service
@Transactional
public class ClienteService extends GenericService<Cliente> {}

package br.senac.rn.loja.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senac.rn.loja.model.Permissao;

@Service
@Transactional
public class PermissaoService extends GenericService<Permissao> {}


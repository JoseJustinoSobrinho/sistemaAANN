package br.senac.rn.loja.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senac.rn.loja.model.Produto;

@Service
@Transactional
public class ProdutoService extends GenericService<Produto> {}

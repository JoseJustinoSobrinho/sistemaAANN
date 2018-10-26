package br.senac.rn.loja.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.senac.rn.loja.model.Marca;

@Service
@Transactional
public class MarcaService extends GenericService<Marca> {}

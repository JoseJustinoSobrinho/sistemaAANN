package br.senac.rn.loja.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.senac.rn.loja.model.AuditedEntity;
import br.senac.rn.loja.repository.GenericRepository;

public abstract class GenericService<T extends AuditedEntity> {

	@Autowired
	protected GenericRepository<T> repository;
	
	public List<T> obterTodos() {
		return repository.findAll();
	}
	
	public Optional<T> obterPorId(Integer id) {
		return repository.findById(id);
	}
	
	public void salvar(T entidade) {
		repository.save(entidade);
	}
	
	public void remover(T entidade) {
		repository.delete(entidade);
	}
	
	public void remover(Integer id) {
		repository.deleteById(id);
	}
	
}

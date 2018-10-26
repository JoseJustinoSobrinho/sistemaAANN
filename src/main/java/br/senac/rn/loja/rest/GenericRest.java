package br.senac.rn.loja.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.senac.rn.loja.model.AuditedEntity;
import br.senac.rn.loja.service.GenericService;

public abstract class GenericRest<T extends AuditedEntity> {

	@Autowired
	private GenericService<T> service;
	
	@GetMapping
	public List<T> obterTodos() {
		return service.obterTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<T> obterPorId(@PathVariable Integer id) {
		Optional<T> entity = service.obterPorId(id);
		if (!entity.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(entity.get());
	}

	@PostMapping
	public ResponseEntity<T> salvar(@RequestBody T entity) {
		service.salvar(entity);
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<T> editar(@PathVariable Integer id, @RequestBody T entity) {
		if (service.obterPorId(id).isPresent()) {
			service.salvar(entity);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<T> remover(@PathVariable Integer id) {
		Optional<T> entity = service.obterPorId(id);
		if (entity.isPresent()) {
			service.remover(entity.get());
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
}

package br.senac.rn.loja.model;

import java.io.Serializable;

public interface PersistableEntity<PK extends Serializable> {
	
	PK getId();
	void setId(PK id);
	
}

package br.senac.rn.loja.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table
@Entity
public class Cliente extends AuditedEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CLIENTE")
	@SequenceGenerator(name="SEQ_CLIENTE", sequenceName="seq_cliente_id", allocationSize=1)
	private Integer id;
	private String nome;
	@Column(unique=true)
	private String cpf;
	@Temporal(TemporalType.DATE)
	private Calendar nascimento;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome.trim().toUpperCase();
	}
	
	public void setNome(String nome) {
		this.nome = nome.trim().toUpperCase();
	}
	
	public String getCpf() {
		return cpf.trim();
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf.trim();
	}
	
	public Calendar getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

package br.senac.rn.loja.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@MappedSuperclass 
//@EntityListeners(AuditingEntityListener.class)
public abstract class AuditedEntity implements PersistableEntity<Integer> {
	
	@CreatedDate
	@Column(nullable = true, updatable = false, name = "DATA_CRIACAO")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao = new Date();
	
	@LastModifiedDate
	@Column(name = "DATA_MODIFICACAO")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataModificacao;

	@Column
	private Boolean ativo = true;

	@JsonIgnore
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@JsonIgnore
	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	@PreUpdate
	public void preUpdate() {
		this.dataModificacao = new Date();
	}

	@JsonIgnore
	public Boolean getAtivo() {
		return ativo;
	}

	@JsonIgnore
	public Boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
}

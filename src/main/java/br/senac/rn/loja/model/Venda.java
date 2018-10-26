package br.senac.rn.loja.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table
@Entity
public class Venda extends AuditedEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_VENDA")
	@SequenceGenerator(name="SEQ_VENDA", sequenceName="seq_venda_id", allocationSize=1)
	private Integer id;
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	@Temporal(TemporalType.DATE)
	private Calendar data;
	private Float valor;
	@ManyToMany
	@JoinTable(name="itens_venda", joinColumns=@JoinColumn(name="venda_id"), inverseJoinColumns=@JoinColumn(name="produto_id"))
	private List<Produto> produtos;
	
	public Venda() {
		this.cliente = new Cliente();
		this.produtos = new ArrayList<Produto>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Float getValor() {
		valor = 0.0f;
		for (Produto produto : produtos) {
			valor += produto.getValor();
		}
		return valor;
	}
	
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
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
		Venda other = (Venda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

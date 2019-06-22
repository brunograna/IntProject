package com.intProject.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "empresa_cliente")
public class EmpresaCliente {

	/*
	 * public EmpresaCliente(int id, String clienteNome, Set<Projeto> projeto) {
	 * super(); this.id = id; this.clienteNome = clienteNome; this.projeto =
	 * projeto; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empresa_cliente_id")
	private int id;
	@Column(name = "empresa_cliente_nome")
	private String clienteNome;
	@OneToMany(mappedBy = "empresaCliente")
	private Set<Projeto> projeto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public Set<Projeto> getProjeto() {
		return projeto;
	}

	public void setProjeto(Set<Projeto> projeto) {
		this.projeto = projeto;
	}

}

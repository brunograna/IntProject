package com.intProject.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "projeto_tipo")
public class ProjetoTipo {

	/*
	 * public ProjetoTipo(int id, String descricao, char status, Set<Projeto>
	 * projeto) { super(); this.id = id; this.descricao = descricao; this.status =
	 * status; this.projeto = projeto; }
	 */

	@Id
	@GeneratedValue
	@Column(name = "projeto_tipo_id")
	private int id;
	@Column(name = "projeto_tipo_descricao")
	private String descricao;
	@Column(name = "projeto_tipo_status")
	private char status;
	@OneToMany(mappedBy="projetoTipo")
	private Set<Projeto> projeto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Set<Projeto> getProjeto() {
		return projeto;
	}

	public void setProjeto(Set<Projeto> projeto) {
		this.projeto = projeto;
	}

}

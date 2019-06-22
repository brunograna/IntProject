package com.intProject.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "colaborador_tipo")
public class ColaboradorTipo {

	/*
	 * public ColaboradorTipo(int id, String nome, char status,
	 * Set<ProjetoColaborador> projetoColaborador) { super(); this.id = id;
	 * this.nome = nome; this.status = status; this.projetoColaborador =
	 * projetoColaborador; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "colaborador_tipo_id")
	private int id;
	@Column(name = "colaborador_tipo_nome")
	private String nome;
	@Column(name = "colaborador_tipo_status")
	private char status;
	@OneToMany(mappedBy = "colaboradorTipo")
	private Set<ProjetoColaborador> projetoColaborador;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Set<ProjetoColaborador> getProjetoColaborador() {
		return projetoColaborador;
	}

	public void setProjetoColaborador(Set<ProjetoColaborador> projetoColaborador) {
		this.projetoColaborador = projetoColaborador;
	}

}

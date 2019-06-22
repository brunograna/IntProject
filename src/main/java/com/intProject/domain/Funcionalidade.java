package com.intProject.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "funcionalidade")
public class Funcionalidade {

	/*
	 * public Funcionalidade(int id, String nome, Set<Colaborador> colaborador) {
	 * super(); this.id = id; this.nome = nome; this.colaborador = colaborador; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "funcionalidade_id")
	private int id;
	@Column(name = "funcionalidade_nome")
	private String nome;
	@ManyToMany(mappedBy = "funcionalidade")
	private Set<Colaborador> colaborador;

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

	public Set<Colaborador> getColaborador() {
		return colaborador;
	}

	public void setColaborador(Set<Colaborador> colaborador) {
		this.colaborador = colaborador;
	}

}

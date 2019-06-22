package com.intProject.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "projeto_colaborador")
public class ProjetoColaborador {

	/*
	 * public ProjetoColaborador(int id, Projeto projeto, Colaborador colaborador,
	 * ColaboradorTipo colaboradortipo) { super(); this.id = id; this.projeto =
	 * projeto; this.colaborador = colaborador; this.colaboradorTipo =
	 * colaboradortipo; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "projeto_id")
	private Projeto projeto;
	@ManyToOne
	@JoinColumn(name = "colaborador_id")
	private Colaborador colaborador;
	@ManyToOne
	@JoinColumn(name = "colaborador_tipo_id")
	private ColaboradorTipo colaboradorTipo;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public ColaboradorTipo getColaboradortipo() {
		return colaboradorTipo;
	}

	public void setColaboradortipo(ColaboradorTipo colaboradortipo) {
		this.colaboradorTipo = colaboradortipo;
	}

}

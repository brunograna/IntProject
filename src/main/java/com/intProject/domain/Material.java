package com.intProject.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "material_armazen")
public class Material {

	/*
	 * public Material(int id, String nome, String tipo, Medida medida,
	 * Set<MaterialProjeto> materialProjeto) { super(); this.id = id; this.nome =
	 * nome; this.tipo = tipo; this.medida = medida; this.materialProjeto =
	 * materialProjeto; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "material_id")
	private int id;
	@Column(name = "material_nome")
	private String nome;
	@Column(name = "material_tipo")
	private String tipo;
	@OneToOne
	@JoinColumn(name = "unidade_medida_id")
	private Medida medida;
	@OneToMany(mappedBy="material")
	private Set<MaterialProjeto> materialProjeto;

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Medida getMedida() {
		return medida;
	}

	public void setMedida(Medida medida) {
		this.medida = medida;
	}

	public Set<MaterialProjeto> getMaterialProjeto() {
		return materialProjeto;
	}

	public void setMaterialProjeto(Set<MaterialProjeto> materialProjeto) {
		this.materialProjeto = materialProjeto;
	}

}

package com.intProject.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "material_projeto")
public class MaterialProjeto {

	/*
	 * public MaterialProjeto(int id, Projeto projeto, Material material, int
	 * quantidade, Set<MaterialOrdemServico> materialOrdemServico) { super();
	 * this.id = id; this.projeto = projeto; this.material = material;
	 * this.quantidade = quantidade; this.materialOrdemServico =
	 * materialOrdemServico; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "material_id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "projeto_id")
	private Projeto projeto;
	@ManyToOne
	@JoinColumn(name = "material_material_id")
	private Material material;
	@Column(name = "material_projeto_quantidade")
	private int quantidade;
	@OneToMany(mappedBy = "materialProjeto")
	private Set<MaterialOrdemServico> materialOrdemServico;

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

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Set<MaterialOrdemServico> getMaterialOrdemServico() {
		return materialOrdemServico;
	}

	public void setMaterialOrdemServico(Set<MaterialOrdemServico> materialOrdemServico) {
		this.materialOrdemServico = materialOrdemServico;
	}

}

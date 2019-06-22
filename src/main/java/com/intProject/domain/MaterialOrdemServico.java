package com.intProject.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "material_ordem_servico")
public class MaterialOrdemServico {

	/*
	 * public MaterialOrdemServico(int id, OrdemServico ordemServico, Projeto
	 * projeto, MaterialProjeto materialProjeto, String quantidade) { super();
	 * this.id = id; this.ordemServico = ordemServico; // this.projeto = projeto;
	 * this.materialProjeto = materialProjeto; this.quantidade = quantidade; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "ordem_servico_id")
	private OrdemServico ordemServico;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "projeto_id") private Projeto projeto;
	 */
	@ManyToOne
	@JoinColumn(name = "material_id")
	private MaterialProjeto materialProjeto;
	@Column(name = "quantidade")
	private String quantidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	/*
	 * public Projeto getProjeto() { return projeto; }
	 * 
	 * public void setProjeto(Projeto projeto) { this.projeto = projeto; }
	 */

	public String getQuantidade() {
		return quantidade;
	}

	public MaterialProjeto getMaterialProjeto() {
		return materialProjeto;
	}

	public void setMaterialProjeto(MaterialProjeto materialProjeto) {
		this.materialProjeto = materialProjeto;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}

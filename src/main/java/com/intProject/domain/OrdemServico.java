package com.intProject.domain;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "ordem_servico")
public class OrdemServico {

	/*
	 * public OrdemServico(int id, String descricao, String local, java.sql.Date
	 * dataInicio, Date dataFim, String contratado, char status, Projeto projeto,
	 * Colaborador colaborador, Set<MaterialOrdemServico> materialOrdemServico) {
	 * super(); this.id = id; this.descricao = descricao; this.local = local;
	 * this.dataInicio = dataInicio; this.dataFim = dataFim; this.contratado =
	 * contratado; this.status = status; this.projeto = projeto; this.colaborador =
	 * colaborador; this.materialOrdemServico = materialOrdemServico; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ordem_servico_id")
	private int id;
	@Column(name = "ordem_servico_descricao")
	private String descricao;
	@Column(name = "ordem_servico_local")
	private String local;
	@Column(name = "ordem_servico_data_inicio")
	private Date dataInicio;
	@Column(name = "ordem_servico_data_fim")
	private Date dataFim;
	@Column(name = "ordem_servico_contratado")
	private String contratado;
	@Column(name = "ordem_servico_status")
	private char status;
	@ManyToOne
	@JoinColumn(name = "projeto_id")
	private Projeto projeto;
	@OneToOne
	@JoinColumn(name = "colaborador_colaborador_id")
	private Colaborador colaborador;
	@OneToMany(mappedBy = "ordemServico")
	private Set<MaterialOrdemServico> materialOrdemServico;

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

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public java.sql.Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(java.sql.Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getContratado() {
		return contratado;
	}

	public void setContratado(String contratado) {
		this.contratado = contratado;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
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

	public Set<MaterialOrdemServico> getMaterialOrdemServico() {
		return materialOrdemServico;
	}

	public void setMaterialOrdemServico(Set<MaterialOrdemServico> materialOrdemServico) {
		this.materialOrdemServico = materialOrdemServico;
	}

}

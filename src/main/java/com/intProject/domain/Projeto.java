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

@Entity(name = "projeto")
public class Projeto {

	/*
	 * public Projeto(int id, String nome, String descricao, String local, Date
	 * dataInicio, Date dataFim, char status, Set<MaterialProjeto> materialProjeto,
	 * EmpresaCliente empresaCliente, Set<OrdemServico> ordemServico, ProjetoTipo
	 * projetoTipo, Set<ProjetoColaborador> projetoColaborador) { super(); this.id =
	 * id; this.nome = nome; this.descricao = descricao; this.local = local;
	 * this.dataInicio = dataInicio; this.dataFim = dataFim; this.status = status;
	 * this.materialProjeto = materialProjeto; this.empresaCliente = empresaCliente;
	 * this.ordemServico = ordemServico; this.projetoTipo = projetoTipo;
	 * this.projetoColaborador = projetoColaborador; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "projeto_id")
	private int id;
	@Column(name = "projeto_nome")
	private String nome;
	@Column(name = "projeto_descricao")
	private String descricao;
	@Column(name = "projeto_local")
	private String local;
	@Column(name = "projeto_data_inicio")
	private Date dataInicio;
	@Column(name = "projeto_data_fim")
	private Date dataFim;
	@Column(name = "projeto_status")
	private char status;
	@OneToMany(mappedBy = "projeto")
	private Set<MaterialProjeto> materialProjeto;
	@ManyToOne
	@JoinColumn(name = "empresa_cliente_nome")
	private EmpresaCliente empresaCliente;
	@OneToMany(mappedBy = "projeto")
	private Set<OrdemServico> ordemServico;
	@ManyToOne
	@JoinColumn(name = "projeto_tipo_id")
	private ProjetoTipo projetoTipo;
	@OneToMany(mappedBy = "projeto")
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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Set<MaterialProjeto> getMaterialProjeto() {
		return materialProjeto;
	}

	public void setMaterialProjeto(Set<MaterialProjeto> materialProjeto) {
		this.materialProjeto = materialProjeto;
	}

	public EmpresaCliente getEmpresaCliente() {
		return empresaCliente;
	}

	public void setEmpresaCliente(EmpresaCliente empresaCliente) {
		this.empresaCliente = empresaCliente;
	}

	public Set<OrdemServico> getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(Set<OrdemServico> ordemServico) {
		this.ordemServico = ordemServico;
	}

	public ProjetoTipo getProjetoTipo() {
		return projetoTipo;
	}

	public void setProjetoTipo(ProjetoTipo projetoTipo) {
		this.projetoTipo = projetoTipo;
	}

	public Set<ProjetoColaborador> getProjetoColaborador() {
		return projetoColaborador;
	}

	public void setProjetoColaborador(Set<ProjetoColaborador> projetoColaborador) {
		this.projetoColaborador = projetoColaborador;
	}

}

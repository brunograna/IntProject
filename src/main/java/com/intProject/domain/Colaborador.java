package com.intProject.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "colaborador")
public class Colaborador {

	/*
	 * public Colaborador(int id, String nome, String sobrenome, String telefone,
	 * String usuario, String senha, char status, OrdemServico ordemServico,
	 * Set<ProjetoColaborador> projetoColaborador, Set<Funcionalidade>
	 * funcionalidade) { super(); this.id = id; this.nome = nome; this.sobrenome =
	 * sobrenome; this.telefone = telefone; this.usuario = usuario; this.senha =
	 * senha; this.status = status; this.ordemServico = ordemServico;
	 * this.projetoColaborador = projetoColaborador; this.funcionalidade =
	 * funcionalidade; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "colaborador_id")
	private int id;
	@Column(name = "colaborador_nome")
	private String nome;
	@Column(name = "colaborador_sobrenome")
	private String sobrenome;
	@Column(name = "colaborador_telefone")
	private String telefone;
	@Column(name = "colaborador_usuario")
	private String usuario;
	@Column(name = "colaborador_senha")
	private String senha;
	@Column(name = "colaborador_status")
	private char status;
	@OneToOne(mappedBy="colaborador")
	private OrdemServico ordemServico;
	@OneToMany(mappedBy = "colaborador")
	private Set<ProjetoColaborador> projetoColaborador;
	@ManyToMany
	@JoinTable(name="funcionalidade_colaborador", joinColumns = @JoinColumn(name="colaborador_colaborador_id"), inverseJoinColumns = @JoinColumn(name="funcionalidade_funcionalidade_id"))
	private Set<Funcionalidade> funcionalidade;

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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	public Set<ProjetoColaborador> getProjetoColaborador() {
		return projetoColaborador;
	}

	public void setProjetoColaborador(Set<ProjetoColaborador> projetoColaborador) {
		this.projetoColaborador = projetoColaborador;
	}

	public Set<Funcionalidade> getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(Set<Funcionalidade> funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

}

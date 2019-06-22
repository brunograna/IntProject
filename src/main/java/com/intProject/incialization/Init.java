package com.intProject.incialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.intProject.domain.Colaborador;
import com.intProject.domain.Material;
import com.intProject.domain.OrdemServico;
import com.intProject.domain.Projeto;
import com.intProject.service.ColaboradorService;
import com.intProject.service.MaterialService;
import com.intProject.service.OrdemServicoService;
import com.intProject.service.ProjetoService;

@Component
public class Init implements ApplicationListener<ApplicationEvent> {

	@Autowired
	OrdemServicoService ordemServicoService;

	@Autowired
	MaterialService materialService;

	@Autowired
	ColaboradorService colaboradorService;
	
	@Autowired
	ProjetoService projetoService;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		char status = 1;
		Material material = new Material();
		material.setNome("Ferramenta 1");
		material.setTipo("Tipo 1");
		Colaborador colaborador = new Colaborador();
		colaborador.setNome("Joao");
		colaborador.setSenha("*******");
		Projeto projeto = new Projeto();
		projeto.setLocal("Realengo");
		projeto.setStatus(status);
		projeto.setNome("Projeto 1");
		OrdemServico ordemServico= new OrdemServico();
		ordemServico.setColaborador(colaborador);
		ordemServico.setLocal("Realengo");
		ordemServico.setProjeto(projeto);
		
		materialService.criar(material);
		colaboradorService.criar(colaborador);
		projetoService.criar(projeto);
		ordemServicoService.criar(ordemServico);
		
		System.out.println("ProjetoIniciado");
		
	}
}

package com.intProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intProject.domain.Projeto;
import com.intProject.service.ProjetoService;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@RequestMapping("/projeto")
public class ProjetoController {
	
	@Autowired
	ProjetoService projetoService;

	@GetMapping("/projetos")
	public ModelAndView listarProjetos() {
		ModelAndView mv = new ModelAndView("projeto/projetos");
		mv.addObject("projetos", projetoService.listar());
		return mv;
	}

	@GetMapping("/adicionarProjeto")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("projeto/adicionarProjeto");
		mv.addObject("projeto", new Projeto());
		return mv;
	}

	@PostMapping("/criarProjeto")
	public ModelAndView criar(Projeto projeto) {
		projetoService.criar(projeto);
		return listarProjetos();
	}

	@GetMapping("/excluirProjeto/{id}")
	public ModelAndView excluir(@PathVariable("id") Integer id) {
		projetoService.excluir(id);
		return listarProjetos();
	}

	@GetMapping("/editarProjeto/{id}")
	public ModelAndView editar(@PathVariable("id") Integer id) throws ObjectNotFoundException {
		ModelAndView mv = new ModelAndView("projeto/editarProjeto");
		mv.addObject("projeto", projetoService.buscar(id));
		return mv;
	}

	@PostMapping("/editarProjeto")
	public ModelAndView editar(Projeto projeto) throws ObjectNotFoundException {
		projetoService.editar(projeto);
		return listarProjetos();
	}
	
}

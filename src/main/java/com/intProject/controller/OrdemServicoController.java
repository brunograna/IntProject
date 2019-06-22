package com.intProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intProject.domain.OrdemServico;
import com.intProject.service.OrdemServicoService;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@RequestMapping("/ordemServico")
public class OrdemServicoController {

	@Autowired
	OrdemServicoService ordemServicoService;

	@GetMapping("/ordensServico")
	public ModelAndView listarOrdensServico() {
		ModelAndView mv = new ModelAndView("ordemServico/ordensServico");
		mv.addObject("ordensServico", ordemServicoService.listar());
		return mv;
	}

	@GetMapping("/adicionarOrdemServico")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("ordemServico/adicionarOrdemServico");
		mv.addObject("ordemServico", new OrdemServico());
		return mv;
	}

	@PostMapping("/criarOrdemServico")
	public ModelAndView criar(OrdemServico ordemServico) {
		ordemServicoService.criar(ordemServico);
		return listarOrdensServico();
	}

	@GetMapping("/excluirOrdemServico/{id}")
	public ModelAndView excluir(@PathVariable("id") Integer id) {
		ordemServicoService.excluir(id);
		return listarOrdensServico();
	}

	@GetMapping("/editarOrdemServico/{id}")
	public ModelAndView editar(@PathVariable("id") Integer id) throws ObjectNotFoundException {
		ModelAndView mv = new ModelAndView("ordemServico/editarOrdemServico");
		mv.addObject("ordemServico", ordemServicoService.buscar(id));
		return mv;
	}

	@PostMapping("/editarOrdemServico")
	public ModelAndView editar(OrdemServico ordemServico) throws ObjectNotFoundException {
		ordemServicoService.editar(ordemServico);
		return listarOrdensServico();
	}

}

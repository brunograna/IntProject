package com.intProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intProject.domain.Colaborador;
import com.intProject.service.ColaboradorService;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@RequestMapping("/colaborador")
public class ColaboradorController {

	@Autowired
	ColaboradorService colaboradorService;

	@GetMapping("/colaboradores")
	public ModelAndView listarColaboradores() {
		ModelAndView mv = new ModelAndView("colaborador/colaboradores");
		mv.addObject("colaboradores", colaboradorService.listar());
		return mv;
	}

	@GetMapping("/adicionarColaborador")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("colaborador/adicionarColaborador");
		mv.addObject("colaborador", new Colaborador());
		return mv;
	}

	@PostMapping("/criarColaborador")
	public ModelAndView criar(Colaborador colaborador) {
		colaboradorService.criar(colaborador);
		return listarColaboradores();
	}

	@GetMapping("/excluirColaborador")
	public ModelAndView excluir(@PathVariable("id") Integer id) {
		colaboradorService.excluir(id);
		return listarColaboradores();
	}

	@GetMapping("/editarColaborador/{id}")
	public ModelAndView editar(@PathVariable("id") Integer id) throws ObjectNotFoundException {
		ModelAndView mv = new ModelAndView("colaborador/editarColaborador");
		mv.addObject("colaborador", colaboradorService.buscar(id));
		return mv;
	}

	@PostMapping("/editarColaborador")
	public ModelAndView editar(Colaborador colaborador) throws ObjectNotFoundException {
		colaboradorService.editar(colaborador);
		return listarColaboradores();
	}

}

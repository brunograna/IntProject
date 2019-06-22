package com.intProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.intProject.domain.Material;
import com.intProject.service.MaterialService;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@RequestMapping("/material")
public class MaterialController {

	@Autowired
	MaterialService materialService;

	@GetMapping("/Materiais")
	public ModelAndView listarMateriais() {
		ModelAndView mv = new ModelAndView("material/materiais");
		mv.addObject("materiais", materialService.listar());
		return mv;
	}

	@GetMapping("/adicionarMaterial")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("material/adicionarMaterial");
		mv.addObject("material", new Material());
		return mv;
	}

	@PostMapping("/criarMaterial")
	public ModelAndView criar(Material material) {
		materialService.criar(material);
		return listarMateriais();
	}

	@GetMapping("/excluirMaterial")
	public ModelAndView excluir(@PathVariable("id") Integer id) {
		materialService.excluir(id);
		return listarMateriais();
	}

	@GetMapping("/editarMaterial/{id}")
	public ModelAndView editar(@PathVariable("id") Integer id) throws ObjectNotFoundException {
		ModelAndView mv = new ModelAndView("material/editarMaterial");
		mv.addObject("material", materialService.buscar(id));
		return mv;
	}

	@PostMapping("/editarMaterial")
	public ModelAndView editar(Material material) throws ObjectNotFoundException {
		materialService.editar(material);
		return listarMateriais();
	}

}

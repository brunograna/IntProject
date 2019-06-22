package com.intProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intProject.domain.Material;
import com.intProject.repository.MaterialRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class MaterialService {

	@Autowired
	private MaterialRepository materialRepository;

	public Material buscar(Integer id) throws ObjectNotFoundException {
		Optional<Material> material = materialRepository.findById(id);
		return material.orElseThrow(() -> new ObjectNotFoundException("Registro inexistente!"));
	}

	public Material criar(Material colaborador) {
		return materialRepository.save(colaborador);
	}

	public Material editar(Material material) throws ObjectNotFoundException {

		Material materialNovo = buscar(material.getId());
		materialNovo.setNome(material.getNome());
		materialNovo.setTipo(material.getTipo());
		materialNovo.setMedida(material.getMedida());
		materialNovo.setMaterialProjeto(material.getMaterialProjeto());

		return materialRepository.save(materialNovo);
	}

	public void excluir(Integer id) {
		materialRepository.deleteById(id);
	}

	public List<Material> listar() {
		return materialRepository.findAll();
	}

}

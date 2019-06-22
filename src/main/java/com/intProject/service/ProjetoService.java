package com.intProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intProject.domain.Projeto;
import com.intProject.repository.ProjetoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ProjetoService {

	@Autowired
	ProjetoRepository projetoRepository;

	public Projeto buscar(Integer id) throws ObjectNotFoundException {
		Optional<Projeto> projeto = projetoRepository.findById(id);
		return projeto.orElseThrow(() -> new ObjectNotFoundException("Registro inexistente!"));
	}

	public Projeto criar(Projeto projeto) {
		return projetoRepository.save(projeto);
	}

	public Projeto editar(Projeto projeto) throws ObjectNotFoundException {

		Projeto projetoNovo = buscar(projeto.getId());
		projetoNovo.setNome(projeto.getNome());
		projetoNovo.setDescricao(projeto.getDescricao());
		projetoNovo.setLocal(projeto.getLocal());
		projetoNovo.setDataInicio(projeto.getDataInicio());
		projetoNovo.setDataFim(projeto.getDataFim());
		projetoNovo.setStatus(projeto.getStatus());
		projetoNovo.setMaterialProjeto(projeto.getMaterialProjeto());
		projetoNovo.setEmpresaCliente(projeto.getEmpresaCliente());
		projetoNovo.setOrdemServico(projeto.getOrdemServico());
		projetoNovo.setProjetoTipo(projeto.getProjetoTipo());
		projetoNovo.setProjetoColaborador(projeto.getProjetoColaborador());
		projetoNovo.setProjetoColaborador(projeto.getProjetoColaborador());

		return projetoRepository.save(projetoNovo);
	}

	public void excluir(Integer id) {
		projetoRepository.deleteById(id);
	}

	public List<Projeto> listar() {
		return projetoRepository.findAll();
	}

}

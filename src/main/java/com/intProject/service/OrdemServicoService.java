package com.intProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intProject.domain.OrdemServico;
import com.intProject.repository.OrdemServicoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class OrdemServicoService {

	@Autowired
	private OrdemServicoRepository ordemServicoRepository;

	public OrdemServico buscar(Integer id) throws ObjectNotFoundException {
		Optional<OrdemServico> ordemServico = ordemServicoRepository.findById(id);
		return ordemServico.orElseThrow(() -> new ObjectNotFoundException("Registro inexistente!"));
	}

	public OrdemServico criar(OrdemServico colaborador) {
		return ordemServicoRepository.save(colaborador);
	}

	public OrdemServico editar(OrdemServico ordemServico) throws ObjectNotFoundException {

		OrdemServico ordemServicoNovo = buscar(ordemServico.getId());
		ordemServicoNovo.setDescricao(ordemServico.getDescricao());
		ordemServicoNovo.setLocal(ordemServico.getLocal());
		ordemServicoNovo.setDataInicio(ordemServico.getDataInicio());
		ordemServicoNovo.setDataFim(ordemServico.getDataFim());
		ordemServicoNovo.setContratado(ordemServico.getContratado());
		ordemServicoNovo.setStatus(ordemServico.getStatus());
		ordemServicoNovo.setProjeto(ordemServico.getProjeto());
		ordemServicoNovo.setColaborador(ordemServico.getColaborador());
		ordemServicoNovo.setMaterialOrdemServico(ordemServico.getMaterialOrdemServico());

		return ordemServicoRepository.save(ordemServicoNovo);
	}

	public void excluir(Integer id) {
		ordemServicoRepository.deleteById(id);
	}

	public List<OrdemServico> listar() {
		return ordemServicoRepository.findAll();
	}

}

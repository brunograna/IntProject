package com.intProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intProject.domain.Colaborador;
import com.intProject.repository.ColaboradorRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ColaboradorService {

	@Autowired
	private ColaboradorRepository colaboradorRepository;

	public Colaborador buscar(Integer id) throws ObjectNotFoundException {
		Optional<Colaborador> colaborador = colaboradorRepository.findById(id);
		return colaborador.orElseThrow(() -> new ObjectNotFoundException("Registro inexistente!"));
	}

	public Colaborador criar(Colaborador colaborador) {
		return colaboradorRepository.save(colaborador);
	}

	public Colaborador editar(Colaborador colaborador) throws ObjectNotFoundException {

		Colaborador colaboradorNovo = buscar(colaborador.getId());
		colaboradorNovo.setNome(colaborador.getNome());
		colaboradorNovo.setSobrenome(colaborador.getSobrenome());
		colaboradorNovo.setTelefone(colaborador.getTelefone());
		colaboradorNovo.setUsuario(colaborador.getUsuario());
		colaboradorNovo.setSenha(colaborador.getSenha());
		colaboradorNovo.setStatus(colaborador.getStatus());
		colaboradorNovo.setOrdemServico(colaborador.getOrdemServico());
		colaboradorNovo.setProjetoColaborador(colaborador.getProjetoColaborador());
		colaboradorNovo.setFuncionalidade(colaborador.getFuncionalidade());

		return colaboradorRepository.save(colaboradorNovo);
	}

	public void excluir(Integer id) {
		colaboradorRepository.deleteById(id);
	}

	public List<Colaborador> listar() {
		return colaboradorRepository.findAll();
	}

}

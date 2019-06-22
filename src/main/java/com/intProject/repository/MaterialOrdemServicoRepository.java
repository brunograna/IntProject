package com.intProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intProject.domain.MaterialOrdemServico;

@Repository
public interface MaterialOrdemServicoRepository extends JpaRepository<MaterialOrdemServico, Integer> {

}

package com.intProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intProject.domain.MaterialProjeto;

@Repository
public interface MaterialProjetoRepository extends JpaRepository<MaterialProjeto, Integer> {

}

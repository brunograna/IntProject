package com.intProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intProject.domain.ProjetoTipo;

@Repository
public interface ProjetoTipoRepository extends JpaRepository<ProjetoTipo, Integer> {

}

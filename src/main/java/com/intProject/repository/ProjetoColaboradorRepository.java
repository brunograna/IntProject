package com.intProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intProject.domain.ProjetoColaborador;

@Repository
public interface ProjetoColaboradorRepository extends JpaRepository<ProjetoColaborador, Integer> {

}

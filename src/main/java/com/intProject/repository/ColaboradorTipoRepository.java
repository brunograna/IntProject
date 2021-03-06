package com.intProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intProject.domain.ColaboradorTipo;

@Repository
public interface ColaboradorTipoRepository extends JpaRepository<ColaboradorTipo, Integer> {

}

package com.intProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intProject.domain.Medida;

@Repository
public interface MedidaRepository extends JpaRepository<Medida, Integer>  {
 
}

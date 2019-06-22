package com.intProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intProject.domain.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer>  {

}

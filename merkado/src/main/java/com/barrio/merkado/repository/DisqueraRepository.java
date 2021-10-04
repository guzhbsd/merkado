package com.barrio.merkado.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barrio.merkado.entity.Disquera;

public interface DisqueraRepository extends JpaRepository<Disquera, Integer>{

	public Optional<Disquera> findByNombreEndingWith(String nombre);
	
	public List<Disquera> findByPais(String pais);
	
	public List<Disquera> findByActivoTrue();
}

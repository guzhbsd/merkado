package com.barrio.merkado.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barrio.merkado.entity.Disquera;
import com.barrio.merkado.repository.DisqueraRepository;
import com.barrio.merkado.service.DisqueraService;

@Service
public class DisqueraServiceImpl implements DisqueraService{

	@Autowired
	private DisqueraRepository disqueraRepository;
	
	@Override
	public Disquera guardar(Disquera disquera) {
		return disqueraRepository.save(disquera);
	}
	
	@Override
	public Disquera buscarPorNombre(String nombre) {
		Optional<Disquera> disqueraOt =  disqueraRepository.findByNombreEndingWith(nombre);
		if (disqueraOt.isPresent()) {
			return disqueraOt.get();
		}
		return null;
	}

	@Override
	public List<Disquera> buscarPorPais(String pais) {
		return disqueraRepository.findByPais(pais);
	}

	@Override
	public List<Disquera> buscarActivos() {
		return disqueraRepository.findByActivoTrue();
	}

}

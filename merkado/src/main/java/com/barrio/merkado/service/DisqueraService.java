package com.barrio.merkado.service;

import java.util.List;

import com.barrio.merkado.entity.Disquera;

public interface DisqueraService {

	public Disquera guardar(Disquera disquera);
	
	public Disquera buscarPorNombre(String nombre);
	
	public List<Disquera> buscarPorPais(String pais);
	
	public List<Disquera> buscarActivos();
}

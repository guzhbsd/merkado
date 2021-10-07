package com.barrio.merkado.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barrio.merkado.entity.Disquera;
import com.barrio.merkado.service.DisqueraService;

@RestController
@RequestMapping(path = "/disquera")
public class DisqueraRest {

	@Autowired
	private DisqueraService disqueraService;

	@PostMapping(path = "/crear")
	public Disquera crear(@RequestBody Disquera disquera) {
		return disqueraService.guardar(disquera);
	}
	
	@PostMapping(path = "/modificar/{id}")
	public Disquera editar(@RequestBody Disquera disquera, @PathVariable Integer id) {
		return disqueraService.guardar(disquera);
	}	
	
	@GetMapping(path = "/buscar/nombres/{nombre}")
	public Disquera buscarPorNombre(@PathVariable String nombre) {
		return disqueraService.buscarPorNombre(nombre);
	}

	@GetMapping(path = "/buscar/pais/{pais}")
	public List<Disquera> buscarPorPais(@PathVariable String pais) {
		return disqueraService.buscarPorPais(pais);
	}

	@GetMapping(path = "/buscar/activos")
	public List<Disquera> buscarActivos() {
		return disqueraService.buscarActivos();
	}
	
}

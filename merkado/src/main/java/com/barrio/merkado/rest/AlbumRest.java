package com.barrio.merkado.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barrio.merkado.entity.Album;
import com.barrio.merkado.service.AlbumService;

@RestController
@RequestMapping(path = "/album")
public class AlbumRest {
	
	private static final int INT_1 = 1;
	private final String EMPIEZA = "empieza";
	private final String FINALIZA = "finaliza";
	private final String CONTIENE = "contiene";
	private final String LIKE = "like";
	
	@Autowired
	private AlbumService albumService;
	
	@GetMapping(path = "/")
	public List<Album> listar(){
		return albumService.leerTodos(); 
	}
	
	@GetMapping(path = "/{id}")
	public Album buscarPorId(@PathVariable(name = "id") Integer id){
		return albumService.buscarPorId(id);
	}
	
	@GetMapping(path = "/query")
	public List<Album> buscarPorTitulo(@RequestParam(name = "titulo") String titulo, @RequestParam(name = "opc") String opcion){
		List<Album> albumLista = null;
		
		if (EMPIEZA.equals(opcion)) {
			albumLista = albumService.buscarPorTituloEmpiezaCon(titulo);
		}else if (FINALIZA.equals(opcion)) {
			albumLista = albumService.buscarPorTituloTerminaCon(titulo);
		}else if (CONTIENE.equals(opcion)) {
			albumLista = albumService.buscarPorTituloContiene(titulo);
		}else if (LIKE.equals(opcion)) {
			String parametro = "%" + titulo + "%"; 
			albumLista = albumService.buscarPorTituloLike(parametro);
		}else {
			Album album = albumService.buscarPorTitulo(titulo);
			albumLista = new ArrayList<Album>(INT_1);
			albumLista.add(album);
		}
		
		return albumLista;
	}
	
}

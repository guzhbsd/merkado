package com.barrio.merkado.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barrio.merkado.entity.Album;
import com.barrio.merkado.service.AlbumService;

@RestController
@RequestMapping(path = "/api")
public class AlbumRest {

	@Autowired
	private AlbumService albumService;
	
	@GetMapping(path = "/albums")
	List<Album> listar(){
		return albumService.leerTodos(); 
	}
}

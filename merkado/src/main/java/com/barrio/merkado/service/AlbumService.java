package com.barrio.merkado.service;

import java.util.List;

import com.barrio.merkado.entity.Album;

public interface AlbumService {
	void eliminar(Album album);
	Album guardar(Album album);
	List<Album> leerTodos();
}

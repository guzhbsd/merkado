package com.barrio.merkado.service;

import java.util.List;

import com.barrio.merkado.entity.Album;

public interface AlbumService {
	List<Album> leerTodos();
	
	Album guardarAlbum(Album album);
}

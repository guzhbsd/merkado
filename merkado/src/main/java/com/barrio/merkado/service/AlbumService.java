package com.barrio.merkado.service;

import java.util.List;

import com.barrio.merkado.entity.Album;

public interface AlbumService {
	List<Album> leerTodos();
	Album buscarPorTitulo(String titulo);
	List<Album> buscarPorTituloLike(String titulo);
	List<Album> buscarPorTituloContiene(String titulo);
	List<Album> buscarPorTituloEmpiezaCon(String titulo);
	List<Album> buscarPorTituloTerminaCon(String titulo);
	Album buscarPorId(Integer id);
}

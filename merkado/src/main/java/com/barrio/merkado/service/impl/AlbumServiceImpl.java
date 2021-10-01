package com.barrio.merkado.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barrio.merkado.entity.Album;
import com.barrio.merkado.repository.AlbumRepository;
import com.barrio.merkado.service.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {
	
	@Autowired
	private AlbumRepository albumRepo;
	
	
	@Override
	public List<Album> leerTodos() {
		List<Album> albumList = albumRepo.findAll();
		return albumList;
	}

	@Override
	public Album buscarPorTitulo(String titulo) {
		Optional<Album> opAlbum = albumRepo.findByTitulo(titulo);
		Album album = opAlbum.isPresent() ? opAlbum.get() : null;
		return album;
	}
	
	@Override
	public List<Album> buscarPorTituloEmpiezaCon(String titulo) {
		Optional<List<Album>> opAlbumLista = albumRepo.findByTituloStartingWith(titulo);
		List<Album> albumLista = opAlbumLista.isPresent() ? opAlbumLista.get() : null;
		return albumLista;
	}
	
	@Override
	public List<Album> buscarPorTituloTerminaCon(String titulo) {
		Optional<List<Album>> opAlbumLista = albumRepo.findByTituloEndingWith(titulo);
		List<Album> albumLista = opAlbumLista.isPresent() ? opAlbumLista.get() : null;
		return albumLista;
	}

	@Override
	public Album buscarPorId(Integer id) {
		Optional<Album> opAlbum = albumRepo.findById(id);
		Album album = opAlbum.isPresent() ? opAlbum.get() : null;
		return album;
	}

	@Override
	public List<Album> buscarPorTituloLike(String titulo) {
		Optional<List<Album>> opAlbumLista = albumRepo.findByTituloLike(titulo);
		List<Album> albumLista = opAlbumLista.isPresent() ? opAlbumLista.get() : null;
		return albumLista;
	}

	@Override
	public List<Album> buscarPorTituloContiene(String titulo) {
		Optional<List<Album>> opAlbumLista = albumRepo.findByTituloContaining(titulo);
		List<Album> albumLista = opAlbumLista.isPresent() ? opAlbumLista.get() : null;
		return albumLista;
	}
	
}

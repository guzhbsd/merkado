package com.barrio.merkado.service.impl;

import java.util.List;

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
	public List<Album> buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

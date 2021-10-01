package com.barrio.merkado.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barrio.merkado.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
	
	Optional<Album> findByTitulo(String titulo);
	Optional<List<Album>> findByTituloLike(String titulo);
	Optional<List<Album>> findByTituloContaining(String titulo);
	Optional<List<Album>> findByTituloStartingWith(String titulo);
	Optional<List<Album>> findByTituloEndingWith(String titulo);
}

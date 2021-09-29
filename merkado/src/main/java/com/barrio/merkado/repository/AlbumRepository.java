package com.barrio.merkado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barrio.merkado.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
	
}

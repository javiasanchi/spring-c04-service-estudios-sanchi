package com.example.services;

import com.example.entities.Peliculas;

import java.util.List;
import java.util.Optional;

public interface PeliculasService {
    List<Peliculas> findAll();
    Optional<Peliculas> findById(Long id);
    List<Peliculas> findAllByNombre();
    List<Peliculas> findAllByEstreno();

}

package com.example.services;

import com.example.entities.Peliculas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


public interface PeliculasService {
    List<Peliculas> findAll();
    Optional<Peliculas> findById(Long id);
    List<Peliculas> findAllByNombre(String nombre);
    List<Peliculas> findAllByDuracionBeetwen (int maxDuracion, int minDuracion);

}

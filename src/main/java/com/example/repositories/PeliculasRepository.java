package com.example.repositories;

import com.example.entities.Peliculas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PeliculasRepository extends JpaRepository<Peliculas, Long> {

    List<Peliculas> findByNombre(String nombre);

    List<Peliculas> findAllByEstreno(LocalDate estreno);

    List<Peliculas> findAllByActiva(Boolean activa);
}

package com.example.services;

import com.example.entities.Peliculas;
import com.example.repositories.PeliculasRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class PeliculasServiceImpl implements PeliculasService {

    private PeliculasRepository peliculasRepo;
    @Override
    public List<Peliculas> findAll() {
        return this.peliculasRepo.findAll();
    }

    @Override
    public Optional<Peliculas> findById(Long id) {
        return this.peliculasRepo.findById(id);
    }

    @Override
    public List<Peliculas> findAllByNombre(String nombre) {
        return null;
    }

    @Override
    public List<Peliculas> findAllByEstreno(LocalDate estreno) {
        return null;
    }
    public  List<Peliculas> findAllByActiva () {
        return this.findAllByActiva();
    }

    public PeliculasServiceImpl(PeliculasRepository peliculasRepo) {
        this.peliculasRepo = peliculasRepo;
    }
}

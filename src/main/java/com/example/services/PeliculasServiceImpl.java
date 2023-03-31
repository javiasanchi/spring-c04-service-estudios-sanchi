package com.example.services;

import com.example.entities.Peliculas;
import com.example.repositories.PeliculasRepository;

import java.util.List;
import java.util.Optional;

public class PeliculasServiceImpl implements PeliculasService {

    private PeliculasRepository peliculasRepo;
    @Override
    public List<Peliculas> findAll() {
        return this.peliculasRepo.findAll();
    }

    @Override
    public Optional<Peliculas> findById() {
        return this.peliculasRepo.findById(Long id);
    }

    @Override
    public List<Peliculas> findAllByNombre() {
        return null;
    }

    @Override
    public List<Peliculas> findAllByEstreno() {
        return null;
    }

    public PeliculasServiceImpl(PeliculasRepository peliculasRepo) {
        this.peliculasRepo = peliculasRepo;
    }
}

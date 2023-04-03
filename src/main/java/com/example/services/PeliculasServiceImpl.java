package com.example.services;

import com.example.entities.Peliculas;
import com.example.repositories.PeliculasRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class PeliculasServiceImpl implements PeliculasService {

    public static final Logger log = LoggerFactory.getLogger(PeliculasService.class);
    private PeliculasRepository peliculasRepo;
    @Override
    public List<Peliculas> findAll() {
        log.info("Aplicando findAll ()");
        return this.peliculasRepo.findAll();
    }

    @Override
    public Optional<Peliculas> findById(Long id) {
        log.info("Encontrar pel'iculas por id {} ", id);
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

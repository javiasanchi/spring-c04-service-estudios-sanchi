package com.example.services;

import com.example.entities.Peliculas;
import com.example.repositories.PeliculasRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class PeliculasServiceImpl implements PeliculasService {

    public static final Logger log = LoggerFactory.getLogger(PeliculasService.class);
    private PeliculasRepository peliculasRepo;
    public PeliculasServiceImpl(PeliculasRepository peliculasRepo) {
        this.peliculasRepo = peliculasRepo;
    }
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
        log.info("Buscar por nombre {} ", nombre);
        return this.peliculasRepo.findByNombre(nombre);
    }

    @Override
    public List<Peliculas> findAllByDuracionBeetwen(int maxDuracion, int minDuracion) {
        return this.findAllByDuracionBeetwen(maxDuracion,minDuracion);
    }


    /*@Override
    public List<Peliculas> findAllByDuracionBeetwen(int maxDuracion, int minDuracion) {
        return this.findAllByDuracionBeetwen(100,160);

    }*/

}

package com.corhuila.proyecto.IService;

import java.util.List;
import java.util.Optional;

import com.corhuila.proyecto.Entity.Persona;

public interface IPersonaService {
    Persona save(Persona persona);
    void update(Persona persona, Long id);
    void delete(Long id);
    Optional<Persona> findById(Long id);
    List<Persona> findAll();
}

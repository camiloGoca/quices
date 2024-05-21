package com.corhuila.proyecto.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.proyecto.Entity.Carro;
import com.corhuila.proyecto.IService.ICarroService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/carro")
public class CarroController {

    @Autowired
    ICarroService service;

    @PostMapping("")
    public Carro save(@RequestBody Carro carro){
         return service.save(carro);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Carro carro, @PathVariable Long id){
        service.update(carro, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("")
    public List<Carro> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Carro> findById(@PathVariable Long id){
        return service.findById(id);
    }
}

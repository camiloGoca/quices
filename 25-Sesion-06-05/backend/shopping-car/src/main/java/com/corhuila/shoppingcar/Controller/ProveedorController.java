package com.corhuila.shoppingcar.Controller;

import com.corhuila.shoppingcar.Document.Producto;
import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.IService.IProductoService;
import com.corhuila.shoppingcar.IService.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/proveedor")
public class ProveedorController {
    //Inyectar el servicio
    @Autowired
    private IProveedorService service;

    @GetMapping()
    public List<Proveedor> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public Proveedor save(@RequestBody Proveedor proveedor) {
        return service.save(proveedor);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Proveedor proveedor, @PathVariable String id) {
        service.update(proveedor, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}

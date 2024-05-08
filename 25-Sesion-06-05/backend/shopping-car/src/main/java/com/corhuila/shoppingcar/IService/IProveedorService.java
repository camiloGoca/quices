package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Document.Proveedor;

import java.util.List;
import java.util.Optional;

public interface IProveedorService {
    List<Proveedor> findAll(); // Devuelve una lista de proveedores
    Optional<Proveedor> findById(String id); // Devuelve un proveedor por su id
    Proveedor save(Proveedor proveedor); // Guarda un proveedor
    void update(Proveedor proveedor, String id); // Actualiza un proveedor
    void delete(String id); // Elimina un proveedor
}

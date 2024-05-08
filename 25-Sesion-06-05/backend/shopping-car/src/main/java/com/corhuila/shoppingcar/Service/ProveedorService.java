package com.corhuila.shoppingcar.Service;

import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.IRepository.IProveedorRepository;
import com.corhuila.shoppingcar.IService.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService implements IProveedorService {

    //Conectar con los datos - IRepository
    // Inyección de dependencia
    @Autowired
    private IProveedorRepository repositoryP;


    @Override
    public List<Proveedor> findAll() {
        return repositoryP.findAll();
    }

    @Override
    public Optional<Proveedor> findById(String id) {
        return repositoryP.findById(id);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return repositoryP.save(proveedor);
    }

    @Override
    public void update(Proveedor proveedor, String id) {

        Optional<Proveedor> ps = repositoryP.findById(id);

        //Cargar nuevo objeto
        if (!ps.isEmpty()){
            Proveedor proveedorUpdate = ps.get();
            proveedorUpdate.setCodigo(proveedor.getCodigo());
            proveedorUpdate.setNombre(proveedor.getNombre());
            proveedorUpdate.setDireccion(proveedor.getDireccion());

            //Actualizar el objeto producto
            repositoryP.save(proveedorUpdate);
        }else{
            System.out.println("No existe el proveedor");
        }
    }

    @Override
    public void delete(String id) {
        repositoryP.deleteById(id);
    }
}
package ec.edu.ups.practi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.ups.practi.models.Proveedor;
import ec.edu.ups.practi.repositories.ProveedorRepository;

@Service
public class ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public Proveedor guardar(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public Proveedor actualizar(Proveedor proveedor, Proveedor proveedorNuevo) {
        proveedor.setNombre(proveedorNuevo.getNombre());
        proveedor.setRuc(proveedorNuevo.getRuc());
        proveedor.setTelefono(proveedorNuevo.getTelefono());
        return proveedorRepository.save(proveedor);
    }

    public void eliminar(Proveedor proveedor) {
        proveedorRepository.delete(proveedor);
    }
}
package ec.edu.ups.practi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.ups.practi.models.Producto;
import ec.edu.ups.practi.repositories.ProductoRepository;


@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }
    
    public Producto actualizar(Producto producto, Producto productoActualizado) {
        producto.setPrecio(productoActualizado.getPrecio());
        producto.setDescripcion(productoActualizado.getDescripcion());
        producto.setProveedor(productoActualizado.getProveedor());
        return productoRepository.save(producto);
    }
    public void eliminar(Producto producto) {
        productoRepository.delete(producto);
    }
}

package ec.edu.ups.practi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.practi.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByDescripcionContains(String descripcion);

   
}

package ec.edu.ups.practi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.practi.models.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor,Long>  {
    
}

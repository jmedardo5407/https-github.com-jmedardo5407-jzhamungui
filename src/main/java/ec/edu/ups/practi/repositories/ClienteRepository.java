package ec.edu.ups.practi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.practi.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    Cliente findByCedula(String cedula);

    List<Cliente> findByNombre(String nombre);
    
}

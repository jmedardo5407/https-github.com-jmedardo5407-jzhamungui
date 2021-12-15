package ec.edu.ups.practi.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.ups.practi.models.Cliente;
import ec.edu.ups.practi.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {
    /*
    @GetMapping("/v1/demo/{nombre}")
    public String prueba(@PathVariable String nombre) {
        return "Hola " + nombre;
    }
    
    @GetMapping("/v2/demo/{nombre}/{apellido}")
    public String prueba(@PathVariable String nombre,@PathVariable String apellido) {
        return "Hola " + nombre + " "+ apellido;      
    } */
    
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/v1/clientes")
    public ResponseEntity<?> post(@RequestBody Cliente cliente) {
        Cliente clienteAlmacenado = clienteService.guardar(cliente);
        return ResponseEntity.ok(clienteAlmacenado);
    }
    @DeleteMapping("/v1/clientes/{idCliente}")
    public ResponseEntity<?> delete(@PathVariable long idCliente) {
        Optional<Cliente> clienteOptional = clienteService.getById(idCliente);
        if (clienteOptional.isPresent()) {
            clienteService.eliminar(clienteOptional.get());
            return ResponseEntity.ok("Registro eliminado");
        } else {
            return ResponseEntity.badRequest().body("No existe cliente");
        }
    }
}

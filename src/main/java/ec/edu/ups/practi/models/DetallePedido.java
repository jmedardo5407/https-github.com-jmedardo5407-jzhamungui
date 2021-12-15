package ec.edu.ups.practi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name="pedido")
    private Pedido pedido;
    @ManyToOne
    @JoinColumn(name = "producto")
    private Producto producto;
    private double precio;
    private int cantidad;
}

package ec.edu.ups.practi.models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Factura {

    private Date fecha;
    private double total;

    
    public double calcularImpuesto() {
        
        return this.total + 2.80;
    }
    
    
}

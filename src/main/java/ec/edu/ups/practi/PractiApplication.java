package ec.edu.ups.practi;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.ups.practi.models.Factura;

@SpringBootApplication
public class PractiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractiApplication.class, args);

		Factura facturaVentas = new Factura();
		facturaVentas.setTotal(20);
		facturaVentas.setFecha(new Date());
		System.out.println(facturaVentas);
		System.out.println(facturaVentas.calcularImpuesto());

		String condicion;

		if (facturaVentas.calcularImpuesto() > 20) {

			condicion = "CALCULADO IMPUESTO";
		} else {
			condicion = "NO CALCULADO";
		}
		System.out.println(condicion);

		for (int i=0; i < 10; i++) {
			System.out.println(" PASO " + i);

		}
	}
}

package ec.edu.ups.practi.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.ups.practi.models.DetallePedido;
import ec.edu.ups.practi.models.Pedido;
import ec.edu.ups.practi.repositories.DetallePedidoRepository;
import ec.edu.ups.practi.repositories.PedidoRepository;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;
    @Transactional
    public Pedido guardar(Pedido pedido, List<DetallePedido> detalles) {
        Pedido pedidoAlmacenado = pedidoRepository.save(pedido);

        for (DetallePedido tmp : detalles) {
            tmp.setPedido(pedidoAlmacenado);
            detallePedidoRepository.save(tmp);
        }
        return pedidoAlmacenado;
    }
}

package depositoAutomatizado;

import java.util.Collections;
import java.util.List;

public class Pedido {
    private List<Mercaderia> mercaderias;
    private PuntoConsolidacion puntoConsolidacion;
    private Cliente cliente;

    public Pedido(Cliente cliente, Mercaderia ... mercaderias){
        this.cliente = cliente;
        Collections.addAll(this.mercaderias, mercaderias);
    }

    public List<Mercaderia> getMercaderias() {
        return mercaderias;
    }

    public PuntoConsolidacion getPuntoConsolidacion() {
        return puntoConsolidacion;
    }

    public void setPuntoConsolidacion(PuntoConsolidacion puntoConsolidacion) {
        this.puntoConsolidacion = puntoConsolidacion;
    }

    public Cliente getCliente() {
        return cliente;
    }
}

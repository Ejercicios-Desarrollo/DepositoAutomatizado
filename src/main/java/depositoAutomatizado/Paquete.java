package depositoAutomatizado;

import java.util.List;

public class Paquete {
    private List<Mercaderia> mercaderias;
    private Cliente cliente;

    public Paquete(List<Mercaderia> mercaderias, Cliente cliente){
        this.mercaderias = mercaderias;
        this.cliente = cliente;
    }
}

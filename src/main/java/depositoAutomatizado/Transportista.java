package depositoAutomatizado;

import java.util.List;

public class Transportista {
    private String nombre;
    private List<Paquete> paquetes;

    public Transportista(String nombre){
        this.nombre = nombre;
    }

    public void notificarPaqueteCompleto(Pedido pedido){
        this.paquetes.add(new Paquete(pedido.getMercaderias(), pedido.getCliente()));
    }
}

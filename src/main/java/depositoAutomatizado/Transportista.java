package depositoAutomatizado;

import java.util.List;

public class Transportista {
    private String nombre;
    private List<Mercaderia> mercaderias;

    public Transportista(String nombre){
        this.nombre = nombre;
    }

    public void notificarPaqueteCompleto(List<Mercaderia> mercaderiasRecibidas){
        this.mercaderias.addAll(mercaderiasRecibidas);
    }
}

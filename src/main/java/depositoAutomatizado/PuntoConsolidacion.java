package depositoAutomatizado;

import java.util.ArrayList;
import java.util.List;

public class PuntoConsolidacion extends Punto {
    private List<Mercaderia> mercaderias;
    public PuntoConsolidacion(Integer x, Integer y, Integer z) {
        super(x, y, z);
        this.mercaderias = new ArrayList<>();
    }

    public void agregarMercaderia(Mercaderia mercaderia){
        this.mercaderias.add(mercaderia);
    }

    public List<Mercaderia> getMercaderias() {
        return mercaderias;
    }
}

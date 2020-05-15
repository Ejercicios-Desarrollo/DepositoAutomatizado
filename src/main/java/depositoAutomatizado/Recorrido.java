package depositoAutomatizado;

import depositoAutomatizado.ordenes.Orden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recorrido {
    private Compartimiento compartimiento;
    private Punto puntoConsolidacion;
    private List<Orden> ordenes;

    public Recorrido(Compartimiento compartimiento, Punto puntoConsolidacion){
        this.compartimiento = compartimiento;
        this.puntoConsolidacion = puntoConsolidacion;
        this.ordenes = new ArrayList<>();
    }

    public Compartimiento getCompartimiento() {
        return compartimiento;
    }

    public Punto getPuntoConsolidacion() {
        return puntoConsolidacion;
    }

    public void agregarOrdenes(Orden ... ordenes){
        Collections.addAll(this.ordenes, ordenes);
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }
}

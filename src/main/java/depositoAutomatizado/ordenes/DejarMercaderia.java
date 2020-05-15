package depositoAutomatizado.ordenes;

import depositoAutomatizado.Punto;
import depositoAutomatizado.PuntoConsolidacion;
import depositoAutomatizado.robots.Robot;

public class DejarMercaderia extends Orden{
    private PuntoConsolidacion puntoConsolidacion;

    public DejarMercaderia(Punto punto) {
        this.puntoConsolidacion = puntoConsolidacion;
    }

    public Punto getPunto() {
        return puntoConsolidacion;
    }

    @Override
    public void ejecutar(Robot robot) {
        robot.dejarMercaderia(this.puntoConsolidacion);
    }
}

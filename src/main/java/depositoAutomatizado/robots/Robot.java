package depositoAutomatizado.robots;

import depositoAutomatizado.*;
import depositoAutomatizado.robots.obstaculos.ObstaculoDetectado;
import depositoAutomatizado.robots.estado.Estado;
import depositoAutomatizado.robots.estado.Libre;

public abstract class Robot {
    protected Estado estado;
    protected ObstaculoDetectado obstaculoDetectado;
    protected Punto puntoInicio;
    protected Punto puntoAcual;
    protected Mercaderia mercaderia;
    private Integer tiempoEspera;

    public Robot(Punto puntoInicio, Integer tiempoEspera){
        this.puntoInicio = puntoInicio;
        this.puntoAcual = puntoInicio;
        this.tiempoEspera = tiempoEspera;
        this.estado = new Libre();
        this.mercaderia = null;
    }

    public Punto getPuntoInicio() {
        return puntoInicio;
    }

    public Punto getPuntoAcual() {
        return puntoAcual;
    }

    public void setPuntoAcual(Punto puntoAcual) {
        this.puntoAcual = puntoAcual;
    }

    public Integer getTiempoEspera() {
        return tiempoEspera;
    }

    public void buscarMercaderia(Recorrido recorrido) {
        recorrido.getOrdenes().stream().forEach(o -> o.ejecutar(this));
    }

    public abstract void desplazarHacia(Punto punto);
    public abstract void recogerMercaderia(Compartimiento compartimiento);
    public abstract void dejarMercaderia(PuntoConsolidacion puntoConsolidacion);
    public abstract void volverAInicio();

    public abstract void esquivarObstaculo();

    public void llamarAMantenimiento(Punto punto){

    }
}

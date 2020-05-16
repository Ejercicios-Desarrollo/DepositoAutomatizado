package depositoAutomatizado.robots;

import depositoAutomatizado.*;
import depositoAutomatizado.observers.IObservable;
import depositoAutomatizado.observers.IObserver;
import depositoAutomatizado.robots.obstaculos.ObstaculoDetectado;
import depositoAutomatizado.robots.estado.Estado;
import depositoAutomatizado.robots.estado.Libre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Robot implements IObservable {
    protected Estado estado;
    protected ObstaculoDetectado obstaculoDetectado;
    protected Punto puntoInicio;
    protected Punto puntoAcual;
    protected Mercaderia mercaderia;
    private Integer tiempoEspera;
    private List<IObserver> observers;

    public Robot(Punto puntoInicio, Integer tiempoEspera){
        this.puntoInicio = puntoInicio;
        this.puntoAcual = puntoInicio;
        this.tiempoEspera = tiempoEspera;
        this.estado = new Libre();
        this.mercaderia = null;
        this.observers = new ArrayList<>();
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

    public String getEstado(){
        return this.estado.getEstado();
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

    @Override
    public void notificar() {
        this.observers.forEach(o -> o.serNotificadoPor(this));
    }

    @Override
    public void agregarObserver(IObserver... observers) {
        Collections.addAll(this.observers, observers);
    }

    @Override
    public void eliminarObserver(IObserver observer) {
        this.observers.remove(observer);
    }
}

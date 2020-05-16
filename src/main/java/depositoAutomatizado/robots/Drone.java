package depositoAutomatizado.robots;

import depositoAutomatizado.*;
import depositoAutomatizado.robots.estado.Libre;
import depositoAutomatizado.robots.estado.Ocupado;

public class Drone extends Robot{
    public Drone(Punto puntoInicio, Integer tiempoEspera) {
        super(puntoInicio, tiempoEspera);
    }

    @Override
    public void desplazarHacia(Punto punto) {
        this.estado = new Ocupado();
        if(punto.isLibre()){
            this.puntoAcual = punto;
        }
        else this.obstaculoDetectado.realizarAccion(this, punto);
    }

    @Override
    public void recogerMercaderia(Compartimiento compartimiento) {
        this.mercaderia = compartimiento.getMercaderia();
        compartimiento.sacarMercaderia();
    }

    @Override
    public void dejarMercaderia(PuntoConsolidacion puntoConsolidacion) {
        puntoConsolidacion.agregarMercaderia(this.mercaderia);
        this.mercaderia = null;
    }

    @Override
    public void volverAInicio() {
        this.puntoAcual = puntoInicio;
        this.estado = new Libre();
        this.notificar();
    }

    @Override
    public void esquivarObstaculo() {

    }
}

package depositoAutomatizado.robots;

import depositoAutomatizado.Compartimiento;
import depositoAutomatizado.Punto;
import depositoAutomatizado.PuntoConsolidacion;
import depositoAutomatizado.robots.estado.Libre;

public class Clark extends Robot{
    public Clark(Punto puntoInicio, Integer tiempoEspera) {
        super(puntoInicio, tiempoEspera);
    }

    @Override
    public void desplazarHacia(Punto punto) {
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
    }

    @Override
    public void esquivarObstaculo() {

    }
}

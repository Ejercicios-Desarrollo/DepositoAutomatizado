package depositoAutomatizado;

public class Compartimiento {
    private Punto punto;
    private Mercaderia mercaderia = null;
    private Recorrido recorrido;

    public Compartimiento(Punto punto, Recorrido recorrido){
        this.punto = punto;
        this.recorrido = recorrido;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setMercaderia(Mercaderia mercaderia) {
        this.mercaderia = mercaderia;
    }

    public Mercaderia getMercaderia() {
        return mercaderia;
    }

    public void sacarMercaderia(){
        this.mercaderia = null;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }
}

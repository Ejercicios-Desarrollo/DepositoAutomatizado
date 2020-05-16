package depositoAutomatizado;

import depositoAutomatizado.observers.IObservable;
import depositoAutomatizado.observers.IObserver;
import depositoAutomatizado.robots.Robot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deposito implements IObserver {
    private List<Compartimiento> compartimientos;
    private List<Pedido> pedidos;
    private List<Recorrido> recorridosPreestablecidos;
    private List<Robot> robots;
    private Transportista transportista;
    private List<Recorrido> recorridosPendientes;

    public Deposito(Transportista transportista){
        this.compartimientos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.recorridosPreestablecidos = new ArrayList<>();
        this.robots = new ArrayList<>();
        this.recorridosPendientes = new ArrayList<>();
        this.transportista = transportista;
    }

    public void agregarCompartimientos(Compartimiento ... compartimientos){
        Collections.addAll(this.compartimientos, compartimientos);
    }

    public void agregarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void agregarRobots(Robot ... robots){
        Collections.addAll(this.robots, robots);
    }

    public void agregarRecorridos(Recorrido ... recorridos){
        Collections.addAll(this.recorridosPreestablecidos, recorridos);
    }

    public void atenderPedido(){
        Pedido pedido = this.pedidos.get(0);
        List<Mercaderia> mercaderias = pedido.getMercaderias();
        List<Compartimiento> compartimientos = mercaderias.stream().map(m -> m.getCompartimiento()).collect(Collectors.toList());
        List<Recorrido> recorridos = compartimientos.stream().map(c -> c.getRecorrido()).collect(Collectors.toList());

        // robots libres
        List<Robot> robotsLibres = this.robots.stream().filter(r -> r.getEstado().equals("Libre")).collect(Collectors.toList());

        robotsLibres
                .parallelStream()
                .forEach(r -> { r.buscarMercaderia(recorridos.get(0));
                                recorridos.remove(0);});

        // Agregar los recorridos que no entraron en la ejecucion paralela
        // El deposito apenas sea notificado por algun robot libre le asignara un recorrido pendiente
        this.recorridosPendientes.addAll(recorridos);
    }

    public Compartimiento getCompartimientoDeMercaderia(Mercaderia mercaderia){
        return this.compartimientos
                .stream()
                .filter(c -> c.getMercaderia() == mercaderia)
                .collect(Collectors.toList())
                .get(0);
    }

    public void verificarMercaderias(Pedido pedido){
        PuntoConsolidacion puntoConsolidacion = pedido.getPuntoConsolidacion();
        boolean mercaderiasEntregadas = pedido.getMercaderias().equals(puntoConsolidacion.getMercaderias());
        if(mercaderiasEntregadas){
            this.transportista.notificarPaqueteCompleto(pedido);
            this.pedidos.remove(0);
        }
    }

    @Override
    public void serNotificadoPor(IObservable iObservable) {
        Robot robot = (Robot) iObservable;
        robot.buscarMercaderia(this.recorridosPendientes.get(0));
        this.recorridosPendientes.remove(0);
    }
}

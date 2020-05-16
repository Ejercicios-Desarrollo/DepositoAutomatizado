package depositoAutomatizado.robots.estado;

import depositoAutomatizado.Recorrido;
import depositoAutomatizado.robots.Robot;

public class Libre implements Estado {

    @Override
    public void buscarMercaderia(Recorrido recorrido, Robot robot) {
        robot.buscarMercaderia(recorrido);
    }

    @Override
    public String getEstado() {
        return "Libre";
    }
}

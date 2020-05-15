package depositoAutomatizado.robots.estado;

import depositoAutomatizado.Recorrido;
import depositoAutomatizado.robots.Robot;

public interface Estado {
    public void buscarMercaderia(Recorrido recorrido, Robot robot);
}

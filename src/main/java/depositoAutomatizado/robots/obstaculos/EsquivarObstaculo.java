package depositoAutomatizado.robots.obstaculos;

import depositoAutomatizado.Punto;
import depositoAutomatizado.robots.Robot;

public class EsquivarObstaculo implements ObstaculoDetectado {
    @Override
    public void realizarAccion(Robot robot, Punto punto) {
        robot.esquivarObstaculo();
    }
}

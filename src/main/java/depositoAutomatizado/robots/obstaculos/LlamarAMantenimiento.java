package depositoAutomatizado.robots.obstaculos;

import depositoAutomatizado.Punto;
import depositoAutomatizado.robots.Robot;

public class LlamarAMantenimiento implements ObstaculoDetectado {
    @Override
    public void realizarAccion(Robot robot, Punto punto) {
        robot.llamarAMantenimiento(punto);
    }
}

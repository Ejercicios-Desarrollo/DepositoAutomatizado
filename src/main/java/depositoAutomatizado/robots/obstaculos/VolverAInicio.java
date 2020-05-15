package depositoAutomatizado.robots.obstaculos;

import depositoAutomatizado.Punto;
import depositoAutomatizado.robots.Robot;

public class VolverAInicio implements ObstaculoDetectado{
    @Override
    public void realizarAccion(Robot robot, Punto punto) {
        robot.volverAInicio();
    }
}

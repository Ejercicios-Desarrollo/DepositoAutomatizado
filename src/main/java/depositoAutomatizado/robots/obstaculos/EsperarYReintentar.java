package depositoAutomatizado.robots.obstaculos;

import depositoAutomatizado.Punto;
import depositoAutomatizado.robots.Robot;

public class EsperarYReintentar implements ObstaculoDetectado{

    @Override
    public void realizarAccion(Robot robot, Punto punto) {
        try {
            Thread.sleep(robot.getTiempoEspera());
            robot.desplazarHacia(punto);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

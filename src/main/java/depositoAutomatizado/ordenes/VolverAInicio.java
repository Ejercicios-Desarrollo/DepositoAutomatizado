package depositoAutomatizado.ordenes;

import depositoAutomatizado.robots.Robot;

public class VolverAInicio extends Orden {
    @Override
    public void ejecutar(Robot robot) {
        robot.volverAInicio();
    }
}

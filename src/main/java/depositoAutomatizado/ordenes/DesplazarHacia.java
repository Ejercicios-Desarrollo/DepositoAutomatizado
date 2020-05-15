package depositoAutomatizado.ordenes;

import depositoAutomatizado.Punto;
import depositoAutomatizado.robots.Robot;

public class DesplazarHacia extends Orden {
    private Punto punto;

    public DesplazarHacia(Punto punto) {
        this.punto = punto;
    }

    public Punto getPunto() {
        return punto;
    }

    @Override
    public void ejecutar(Robot robot) {
        robot.desplazarHacia(this.punto);
    }
}

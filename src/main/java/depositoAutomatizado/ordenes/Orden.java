package depositoAutomatizado.ordenes;

import depositoAutomatizado.robots.Robot;

public abstract class Orden {
    public abstract void ejecutar(Robot robot);
}

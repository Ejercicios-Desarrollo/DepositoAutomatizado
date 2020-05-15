package depositoAutomatizado.ordenes;

import depositoAutomatizado.Compartimiento;
import depositoAutomatizado.robots.Robot;

public class RecogerMercaderia extends Orden{
    private Compartimiento compartimiento;

    public RecogerMercaderia(Compartimiento compartimiento) {
        this.compartimiento = compartimiento;
    }

    public Compartimiento getCompartimiento() {
        return compartimiento;
    }

    @Override
    public void ejecutar(Robot robot) {
        robot.recogerMercaderia(this.compartimiento);
    }
}

package depositoAutomatizado;

public class Mercaderia {
    private String nombre;
    private Compartimiento compartimiento;

    public Mercaderia(String nombre, Compartimiento compartimiento){
        this.nombre = nombre;
        this.compartimiento = compartimiento;
    }

    public Compartimiento getCompartimiento() {
        return compartimiento;
    }
}

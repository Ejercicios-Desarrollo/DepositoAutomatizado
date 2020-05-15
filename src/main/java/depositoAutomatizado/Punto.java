package depositoAutomatizado;

public class Punto {
    private Integer x;
    private Integer y;
    private Integer z;
    private boolean libre;

    public Punto(Integer x, Integer y, Integer z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.libre = true;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public boolean isLibre() {
        return libre;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getZ() {
        return z;
    }

    public void diferenciaEntre(Punto punto){
        this.x += punto.getX();
        this.y += punto.getY();
        this.z += punto.getZ();
    }
}

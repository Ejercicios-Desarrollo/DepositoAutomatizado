package depositoAutomatizado.observers;

public interface IObservable {
    public void agregarObserver(IObserver ... observers);
    public void eliminarObserver(IObserver iObserver);
    public void notificar();
}

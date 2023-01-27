package Clima;

public interface subject {
    public void registerObserver(CurrentConditions currentConditios);
    public void removeObserver();
    public void notifyObservers();
}

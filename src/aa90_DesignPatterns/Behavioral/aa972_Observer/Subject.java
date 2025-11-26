package aa90_DesignPatterns.Behavioral.aa972_Observer;

public interface Subject
{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

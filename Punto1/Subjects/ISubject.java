package Punto1.Subjects;
import Punto1.Observers.*;

public interface ISubject {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String message);
}

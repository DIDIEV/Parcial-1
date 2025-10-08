package Punto1.Subjects;

import Punto1.Observers.*;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject{
    public List<Observer> observers;
    
    public Subject(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
        System.out.println("observer: " + observer.getName() + "\thas been removed");
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer observer : observers){
            observer.updateInfo(message);
        }
    }

}

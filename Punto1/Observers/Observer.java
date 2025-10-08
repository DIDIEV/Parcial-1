package Punto1.Observers;

public class Observer implements IObserver {
    protected String name;

    public Observer(String name){
        this.name = name;
    }
    
    @Override
    public void updateInfo(String info) {
        System.out.println("Hey " + this.name + "a new course is available: " + info);
    }

    public String getName(){
        return name;
    }
}

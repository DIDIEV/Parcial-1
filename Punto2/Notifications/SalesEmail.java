package Punto2.Notifications;

import Punto2.User;

public class SalesEmail extends Notification{
    private String message;

    public SalesEmail(User user,String message){
        super(user);
        this.message = message;
    }

    @Override
    public void display() {
        System.out.println("!!Hello " + this.user.getEmail() + " there's a new juicy sale available: " + message + " stay tuned for more!");
    }
}

package Punto2.Notifications;

import Punto2.User;

public class SalesSms extends Notification {
    
    private String message;

    public SalesSms(User user,String message){
        super(user);
        this.message = message;
    }

    @Override
    public void display() {
        System.out.println("New message for "+ this.user.getContactumber() + "\n!!Hello " + this.user.getName() + " there's a new juicy sale available: " + message + " stay tuned for more!");
    }
}

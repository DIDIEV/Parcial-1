package Punto2.Notifications;

import Punto2.User;

public class Balance extends Notification {

    public Balance(User user){
        super(user);
    }
    @Override
    public void display() {
        System.out.println("!!Hello " + this.user.getName() + " this message is to inform your current bank balance: " + this.user.getBalance() + " is your current balance");
    }
}

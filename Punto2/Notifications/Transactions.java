package Punto2.Notifications;

import Punto2.User;

public class Transactions extends Notification {
    private String message;
    private float transacction;
    public Transactions(User user,float transacction){
        super(user);
        this.transacction = transacction;
    }
    @Override
    public void display() {
        float newbalance = this.user.getBalance() - transacction;
        System.out.println("!!Hello " + this.user.getName() + " this message is to inform a recent movement in your account : " + message + newbalance + " is your current balance");
    }
}

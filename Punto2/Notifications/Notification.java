package Punto2.Notifications;

import Punto2.User;

public abstract class Notification {
    protected float quantity;
    protected User user = new User(null, null,null, true, 0);

    public Notification( User user){
        this.user = user;
    }

    public abstract void display();
}

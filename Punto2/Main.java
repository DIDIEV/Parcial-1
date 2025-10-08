package Punto2;

import Punto2.Notifications.SalesEmail;
import Punto2.Notifications.SalesSms;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("some@One.com", "212318461", "Juanito Alcachofa", true, 14000);
        String message = "there's a new iPhone available";

        if (user1.preference) {
            SalesEmail salesEmail = new SalesEmail(user1, message);
        }else{
            SalesSms = new SalesSms(user1, message);
        }
    }
}

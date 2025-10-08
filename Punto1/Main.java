package Punto1;
import java.util.Scanner;

import Punto1.Observers.Observer;
import Punto1.Subjects.Notification;
import Punto1.Subjects.Subject;
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Subject blancaMontanhez = new Subject();
        Observer andrea = new Observer("Andrea Mahecha");
        Observer luz = new Observer("Luz Dary Varela");
        Observer laura = new Observer("Laura Molano");
        int switchInt = -1;

        blancaMontanhez.addObserver(laura);
        blancaMontanhez.addObserver(luz);
        blancaMontanhez.addObserver(andrea);


        do{
            System.out.println("1. create a message");
            System.out.println("2. Remove an observer");
            System.out.println("0. exit");
            switchInt = scanner.nextInt();
            scanner.nextLine();
            switch (switchInt) {
                case 1:
                    Notification newNotification = new Notification(null, null);
                    System.out.println("Please enter the name of the course");
                    newNotification.setCourse(scanner.nextLine());

                    System.out.println("Please enter the message body");
                    newNotification.setMessage(scanner.nextLine());
                    blancaMontanhez.notifyObservers(newNotification.toString());

                    break;
                case 2:
                    System.out.println("please enter the name of the observer: ");
                    String removed = scanner.nextLine();
                    for(Observer observer : blancaMontanhez.observers){
                        if(observer.getName().equals(removed)){
                            blancaMontanhez.removeObserver(observer);
                        }
                    }
                    break;
                default:
                    System.out.println("turning off the software...");
                    break;
            }
        }while(switchInt != 0);
        scanner.close();
    }
}

package DesignPattern.Observer_Pattern;

public class Main {

    public static void main(String[] args) {

        NotificationSystem system = new NotificationSystem();

        Client c1 = new Client();
        Admin a1 = new Admin();

        system.register(c1);
        system.register(a1);

        system.sendNotification();
    }
}
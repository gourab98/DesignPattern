package DesignPattern.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem {
    private final List<Listener> listeners = new ArrayList<>();

    public void register(Listener notificationListener){
        listeners.add(notificationListener);
    }

    public void sendNotification(){
        for(Listener listener : listeners){
            listener.notification();
        }
    }
}
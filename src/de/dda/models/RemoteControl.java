package de.dda.models;

import java.util.Timer;
import java.util.TimerTask;

public class RemoteControl {

    private DogDoor dogDoor;

    public RemoteControl(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressButton() {
        System.out.println("Remote control button is being pressed...");

        if(dogDoor.isOpen()) {
            dogDoor.close();
        }else {
            dogDoor.open();
        }

        // This is a behavior which actually belongs to the DogDoor. Not to the RemoteControl
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               dogDoor.close();
               timer.cancel();
            }
        }, dogDoor.getAutomaticClosureTimeOutInSeconds());
    }

}
package de.dda.models;

/**
 * Created by nweis on 23.06.2016.
 */
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
    }

}

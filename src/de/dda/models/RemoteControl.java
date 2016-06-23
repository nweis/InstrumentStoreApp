package de.dda.models;

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
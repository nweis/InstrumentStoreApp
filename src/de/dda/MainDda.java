package de.dda;

import de.dda.models.DogDoor;
import de.dda.models.RemoteControl;

public class MainDda {

    public static void main(String[] args) {

        DogDoor dogDoor = new DogDoor();
        RemoteControl remoteControl = new RemoteControl(dogDoor);

        System.out.println("Fido wants out.");
        remoteControl.pressButton();

        System.out.println("\nFido is out.");

        System.out.println("\nFido is done.");

        System.out.println("\nFido is in.");

    }

}

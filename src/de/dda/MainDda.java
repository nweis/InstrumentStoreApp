package de.dda;

import de.dda.models.DogDoor;
import de.dda.models.RemoteControl;

/**
 * Created by nweis on 23.06.2016.
 */
public class MainDda {

    public static void main(String[] args) {

        DogDoor dogDoor = new DogDoor();
        RemoteControl remoteControl = new RemoteControl(dogDoor);

        System.out.println("Fido wants out.");
        remoteControl.pressButton();

        System.out.println("\nFido is out.");
        remoteControl.pressButton();

        System.out.println("\nFido is done.");
        remoteControl.pressButton();

        System.out.println("\nFido is in.");
        remoteControl.pressButton();

    }

}

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


        try{
            Thread.currentThread().sleep(2000);
        }catch (InterruptedException e) {
            // We'll just do nothing to catch this exception
        }

        System.out.println("\n...but Fido is locked out.");
        System.out.println("\n...Tina is pushing the button again.");
        remoteControl.pressButton();
        System.out.println("\nFido is in.");

    }

}

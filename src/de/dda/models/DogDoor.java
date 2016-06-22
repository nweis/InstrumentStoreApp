package de.dda.models;

/**
 * Created by nweis on 23.06.2016.
 */
public class DogDoor {

    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door is being opened.");
        open = true;
    }

    public void close() {
        System.out.println("The dog door is being closed.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
}

package de.dda.models;

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

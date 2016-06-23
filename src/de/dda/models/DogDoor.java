package de.dda.models;

public class DogDoor {

    private boolean open;
    private int automaticClosureTimeOutInSeconds;

    public DogDoor() {
        this.automaticClosureTimeOutInSeconds = 1000;
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

    public int getAutomaticClosureTimeOutInSeconds() {
        return automaticClosureTimeOutInSeconds;
    }
}

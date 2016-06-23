package de.dda.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogDoorTest {
    @Test
    public void open() throws Exception {
        DogDoor dogDoor = new DogDoor();
        assertEquals(false, dogDoor.isOpen());

        dogDoor.open();
        assertEquals(true, dogDoor.isOpen());
    }

    @Test
    public void close() throws Exception {
        DogDoor dogDoor = new DogDoor();
        assertEquals(false, dogDoor.isOpen());

        dogDoor.open();
        assertEquals(true, dogDoor.isOpen());

        dogDoor.close();
        assertEquals(false, dogDoor.isOpen());
    }

    @Test
    public void isOpen() throws Exception {
        DogDoor dogDoor = new DogDoor();
        assertEquals(false, dogDoor.isOpen());
    }

}
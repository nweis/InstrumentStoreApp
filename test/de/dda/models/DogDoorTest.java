package de.dda.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogDoorTest {
    private DogDoor dogDoor;

    @Before
    public void SetUp() {
        dogDoor = new DogDoor();
        assertEquals(false, dogDoor.isOpen());
    }

    @Test
    public void open() throws Exception {
        dogDoor.open();
        assertEquals(true, dogDoor.isOpen());
    }

    @Test
    public void close() throws Exception {
        dogDoor.open();
        assertEquals(true, dogDoor.isOpen());

        dogDoor.close();
        assertEquals(false, dogDoor.isOpen());
    }

    @Test
    public void isOpen() throws Exception {
        assertEquals(false, dogDoor.isOpen());
    }

    @Test
    public void getAutomaticClosureTimeOutInSeconds() throws Exception{
        assertEquals("The initial closureTimeOutInSeconds should be 1000ms", 1000, dogDoor.getAutomaticClosureTimeOutInSeconds());
    }

}
package de.dda.models;

import org.junit.Before;
import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

public class RemoteControlTest {
    private RemoteControl remoteControl;
    private DogDoor dogDoor;


    @Before
    public void setUp() throws Exception {
        dogDoor = new DogDoor();

        assertFalse(dogDoor.isOpen());
        remoteControl = new RemoteControl(dogDoor);
    }

    @Test
    public void pressButton() throws Exception {
        remoteControl.pressButton();
        assertTrue("Dogdoor should be open", dogDoor.isOpen());

        remoteControl.pressButton();
        assertFalse("Dogdoor should be closed", dogDoor.isOpen());

    }

    @Test
    public void pressButtonAutomaticClose() throws Exception {
        remoteControl.pressButton();
        assertTrue("Dogdoor should be open", dogDoor.isOpen());

        Thread.sleep(dogDoor.getAutomaticClosureTimeOutInSeconds() + 100);

        assertFalse("Dogdoor should be closed after " + dogDoor.getAutomaticClosureTimeOutInSeconds() + "ms", dogDoor.isOpen());
    }

}
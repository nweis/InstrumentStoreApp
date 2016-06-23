package de.dda.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nweis on 23.06.2016.
 */
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

}
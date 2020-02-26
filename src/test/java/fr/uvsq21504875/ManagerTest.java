package fr.uvsq21504875;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {
    @Test
    public void calculSalaire() throws Exception {
        Manager m = new Manager(0,0);
        assertEquals(1500,m.calculSalaire());
    }

}
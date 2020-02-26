package fr.uvsq21504875;

import org.junit.Test;

import static org.junit.Assert.*;

public class VendeurTest {
    @Test
    public void calculSalaire() throws Exception {
        Vendeur v = new Vendeur(0,0);
        assertEquals(1500,v.calculSalaire());
    }

}
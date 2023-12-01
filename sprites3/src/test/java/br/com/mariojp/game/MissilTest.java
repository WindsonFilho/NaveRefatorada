package br.com.mariojp.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MissilTest {

    @Test
    public void testInicializacaoMissil() {
        Missil missil = new Missil(10, 20, 100);
        assertEquals(10, missil.getX());
        assertEquals(20, missil.getY());
        assertEquals(100, missil.getAlcance());
        assertTrue(missil.isVisible());
    }

    @Test
    public void testMoveMissil() {
        Missil missil = new Missil(10, 20, 100);
        missil.move();
        assertEquals(12, missil.getX());
        assertTrue(missil.isVisible());

        for (int i = 0; i < 100; i++) {
            missil.move();
        }
        assertFalse(missil.isVisible());
    }
}

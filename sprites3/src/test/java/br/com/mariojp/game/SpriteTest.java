package br.com.mariojp.game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SpriteTest {

    @Test
    public void testCarregarImagem() {
        Sprite sprite = new Sprite(0, 0);
        sprite.carregarImagem("/imagens/alien.png"); 
        assertNotNull(sprite.getImage());
    }

    @Test
    public void testGetImageDimensions() {
        Sprite sprite = new Sprite(0, 0);
        sprite.carregarImagem("/imagens/alien.png"); 
        sprite.getImageDimensions();
        assertTrue(sprite.width > 0);
        assertTrue(sprite.height > 0);
    }

    @Test
    public void testInicializacaoVisibilidade() {
        Sprite sprite = new Sprite(0, 0);
        assertTrue(sprite.isVisible());
    }

    @Test
    public void testSetVisibilidade() {
        Sprite sprite = new Sprite(0, 0);
        sprite.setVisible(false);
        assertFalse(sprite.isVisible());
    }

    @Test
    public void testGetBounds() {
        Sprite sprite = new Sprite(10, 20);
        sprite.carregarImagem("/imagens/alien.png"); 
        sprite.getImageDimensions();
        assertTrue(sprite.getBounds().getWidth() > 0);
        assertTrue(sprite.getBounds().getHeight() > 0);
        assertEquals(10, sprite.getBounds().getX());
        assertEquals(20, sprite.getBounds().getY());
    }

    @Test
    public void testGetImage() {
        Sprite sprite = new Sprite(0, 0);
        sprite.carregarImagem("/imagens/alien.png"); 
        assertNotNull(sprite.getImage());
    }
}

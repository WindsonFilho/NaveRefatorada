package br.com.mariojp.game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InimigoTest {

    @Test
    public void testMove_ResetPosicaoQuandoNegativa() {
        Inimigo inimigo = new Inimigo(10, 20);
        
        
        inimigo.setX(-1);
        inimigo.move();
        
        assertEquals(inimigo.initX -1, inimigo.getX() , "A posição deve ser reiniciada quando negativa");
    }

    @Test
    public void testMove_DecrementaEmDoisQuandoValorIgualUm() {
        Inimigo inimigo = new Inimigo(10, 20);
        inimigo.valor = 1; 


        int posicaoAtual = inimigo.getX();
        
        inimigo.move();

        assertEquals(posicaoAtual - 3, inimigo.getX(), "A posição deve ser decrementada em 2 quando valor igual a 1");
    }

    @Test
    public void testMove_DecrementaEmUmQuandoValorDiferenteDeUm() {
        Inimigo inimigo = new Inimigo(10, 20);
        inimigo.valor = 2; 

        
        int posicaoAtual = inimigo.getX();
        
        inimigo.move();

        assertEquals(posicaoAtual - 1, inimigo.getX(), "A posição deve ser decrementada em 1 quando valor diferente de 1");
    }
}

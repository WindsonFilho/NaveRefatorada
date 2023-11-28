package br.com.mariojp.game;

import java.util.Random;

public class Inimigo extends Sprite implements Observer {

	Random random = new Random();

	int valor = random.nextInt(10);
	private int initX;

	public Inimigo(int x, int y) {
		super(x, y);
		this.initX = x;
		initInimigo();
	}

	private void initInimigo() {
		carregarImagem("/imagens/alien.png");
		getImageDimensions();
	}

	public void move() {
		if (x < 0) {
			x = initX;
		} else if (valor == 1) {

			update("Nave se moveu!", x -= 2);

		}
		x -= 1;

	}

	@Override
	public void update(String message, int x) {
		if (message.equals("Nave se moveu!")) {

			System.out.println("Inimigo: " + message + " Nova posição da nave: " + x);
		} else if (message.equals("Inimigo com velocidade aumentada !")) {

			System.out.println("Inimigo: " + message);
		}
	}

	@Override
	public void updateMovimentoRapidoInimigo(String message, int x) {

		System.out.println("Inimigo: " + message + " Nova posição do inimigo: " + x);
	}

	@Override
	public void updateMovimentoNave(String message, int x) {
		if (message.equals("Nave se moveu!")) {
			this.x-=2;
			System.out.println("Inimigo: A nave se moveu! Atualizando posição do inimigo: " + x);
			System.out.println("Posicao"+this.x);
		}

	}

	@Override
	public void update(String message) {
		System.out.println("Inimigo: " + message);

	}

}

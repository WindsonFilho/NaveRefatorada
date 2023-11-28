package br.com.mariojp.game;

public interface Observer {

	 void updateMovimentoNave(String message,int x);
	 void updateMovimentoRapidoInimigo(String message, int x);
	 void update(String message, int x);
	 void update(String message);

	
}

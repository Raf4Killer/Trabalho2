package Principal;
/***
 * Classe Trabalho2<br>
 * @author Rafael Cardoso
 * @since 2021
 * @version 0.1
 * 
 */

import Jogador.Jogador;

public class Principal {

	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		
		//informando caracter�sticas do jogador		
		jogador.setEnergia(100);
		jogador.setNome("Ronaldinho");
		jogador.setAltura(1.82f);
		jogador.setVelocidade(99);
		jogador.setGol(true);
		
		//Imprime as Caracter�sticas do jogador
		jogador.DadosJogador();
		
		System.out.println("------------------------------------");
		
		//executa as a��es do jogador
		jogador.ExecutaAcao();
		
	}

}

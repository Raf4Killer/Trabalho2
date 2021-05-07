package Jogador;
/***
 * Classe Acao<br>
 * @author Rafael Cardoso
 * @since 2021
 * @version 0.1
 * 
 */
public abstract class Acao {
	public abstract void Correr();
	public abstract void Chutar();
	public abstract boolean VaiJogar();
	public abstract void EntraEmCampo();
	public abstract void VerificaGol();
	public abstract void Comemora();
	public abstract boolean SituacaoJogador(boolean r);
	
	/***
	 Organiza a ordem de execu��o das a��es do jogador
	 */
	public final void ExecutaAcao() {
		
		//verifica se ir� joga	
		
		if(VaiJogar() == false) {
			System.out.println("O jogador n�o ir� jogar!");
			System.out.println("Finalizando programa...");
			System.exit(0);
		}
		//Informa se o jogador ir� ou n�o jogar
		SituacaoJogador(true);
		
		//jogador entra em campo
		EntraEmCampo();
		
		
		//correndo em dire��o a bola
		Correr();	

		//chuta a bola
		Chutar();
		
		//verifica se foi gol
		VerificaGol();
		
		//se for gol comemora, sen�o n�o comemora
		Comemora();
	}
}

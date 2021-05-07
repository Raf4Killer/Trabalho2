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
	 Organiza a ordem de execução das ações do jogador
	 */
	public final void ExecutaAcao() {
		
		//verifica se irá joga	
		
		if(VaiJogar() == false) {
			System.out.println("O jogador não irá jogar!");
			System.out.println("Finalizando programa...");
			System.exit(0);
		}
		//Informa se o jogador irá ou não jogar
		SituacaoJogador(true);
		
		//jogador entra em campo
		EntraEmCampo();
		
		
		//correndo em direção a bola
		Correr();	

		//chuta a bola
		Chutar();
		
		//verifica se foi gol
		VerificaGol();
		
		//se for gol comemora, senão não comemora
		Comemora();
	}
}

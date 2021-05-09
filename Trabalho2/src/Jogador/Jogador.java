package Jogador;
/***
 * Classe jogador<br>
 * @author Rafael Cardoso
 * @since 2021
 * @version 0.1
 * 
 */
public class Jogador extends TemplateMethod{
	
	public float altura;
	public String nome;
	public float velocidade;
	public float energia;
	boolean gol;
	boolean verifica = false;
	
	/***
	 * <b> Correr()</b>  Indica que o jogador est� correndo em dire��o a bola <br>
	 */
	@Override
	public void Correr() {
		System.out.println("Correndo em dire��o a bola...");
	}
	
	/***
	 * <b> Chutar()</b>  Indica que o jogador ir� chutar a bola <br>
	 */
	@Override
	public void Chutar() {
		System.out.println("Chutou a bola!");
		
	}
	
	/***
	 * <b> EntraEmCampo() </b> Verifica se o jogador ir� Entra em campo <br>
	 */
	@Override
	public void EntraEmCampo() {
			System.out.println("Entrando em campo...");		
	}
	
	/***
	 * <b> VaiJogar()</b>  Se a energia for maior ou igual a 50 o jogador ir� jogar se for menor do que 50 e maior que 100 o programa ser� finalizado<br>
	 */
	@Override
	public boolean VaiJogar() {
		
		if(this.energia >= 50 && this.energia <= 100 ) {
			verifica = true;	
		}else if(this.energia < 50 && this.energia > 0 ) {
		 	System.out.println("Energia baixa!");		
			verifica = false;	
		}else if( this.energia >100 || this.energia <= 0 ){	
			System.out.println("Energia inv�lida!");		
			this.energia = 0;
			verifica = false;	
		}
		
		return verifica;		
	}
	
     /***
      * <b> VerificaGol()</b>  Verifica se foi gol ou n�o <br>
      */
	 @Override
	 public void VerificaGol() {
		 if(this.isGol()) {
			 System.out.println("Foi gol!");
			 
		 }else if(!this.isGol()) {
			 System.out.println("N�o foi gol!");
		 }
	 }
	 
	 /***
	  * <b> Comemora()</b>  Se foi gol, o jogador ir� comemorar <br>
	  */
	 @Override
	 public void Comemora() {
		 if(this.isGol()) {
			 System.out.println("Comemorando...");
		 }
	 }
	 	
		public boolean isGol() {
			return gol;
		}
		
		/***
	 	 * Verifica se foi gol
	 	 * @param gol  <b>Verdadeiro:</b> Foi gol  <br> <b>Falso: </b> n�o foi gol <br>  
	 	 *
	 	 * @see Math
	 	 */
		public void setGol(boolean gol) {
			this.gol = gol;
		}
		public float getAltura() {
			return altura;
		}
		
		
		/***
	 	 *@param altura Indica a altura do jogador
	 	 *Ir� setar a altura do jogador 
	 	 */
		public void setAltura(float altura) {
			this.altura = altura;
		}
		
		public String getNome() {
			return nome;
		}
		
		
		/***
	 	 *@param nome Indica o nome do jogador
	 	 * Ir� setar o nome do jogador 
	 	 */
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public float getVelocidade() {
			return velocidade;
		}
		
		
		/***
	 	 *@param velocidade Indica a velocidade do jogador
	 	 * Ir� setar a velocidade do jogador 
	 	 */
		public void setVelocidade(float velocidade) {
			this.velocidade = velocidade;
		}
		
		public float getEnergia() {
			return energia;
		}
		
		/***
	 	 *@param energia Indica a energia do jogador
	 	 *  Ir� setar a energia do jogador 
	 	 */
		public void setEnergia(float energia) {
			this.energia = energia;
		}		
		
		/***
		 * Retorna as caracter�sticas do jogador
		 * Retorna o <b>Nome </b>,
		 *                   <b>Altura </b>,
		 *         			 <b>Velocidade </b> e
		 *         			 <b>Energia </b> do jogador
		 */
		public void DadosJogador() {
			System.out.println("Nome: "+ getNome()+ "\n" +
							   "Altura: "+ getAltura()+ "\n" +
							   "Velocidade: "+ getVelocidade()+ "\n" +
							   "Energia: "+  getEnergia()+ "\n"
							   );
		}
		
		/***
		 * @param v valor de entrada <br>
		 * 
		 * Se for <b> true </b>, o jogador ir� jogar, caso <b>false </b> o jogador n�o ir� jogar
		 * 
		 * @return <b> verifica </b> recebe parametro <b> v </b> e retorna verdadeiro ou falso
		 */		
		//imprime a situa��o do jogador	
		public boolean SituacaoJogador(boolean v) {
			this.verifica = v;
			if(verifica) {
				System.out.println("Jogador ir� jogar!\n");
				return verifica;
			}	
			else
				System.out.println("Jogador n�o ir� jogar\n");
				return verifica;
			
		}

}

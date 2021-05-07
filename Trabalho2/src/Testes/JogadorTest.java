package Testes;
import Jogador.Jogador;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JogadorTest {
	Jogador j = new Jogador();
	
	@Test
	void testSituacaoJogador() {
		System.out.println("Teste 1 : ");
		final boolean ResultadoEsperado = true;
		final boolean resultado = j.SituacaoJogador(true);
		Assert.assertEquals(ResultadoEsperado, resultado);
		
	}
	

	@Test
	void testSituacaoJogador2() {
		System.out.println("Teste 2 : ");
		final boolean ResultadoEsperado = true;
		final boolean resultado = j.SituacaoJogador(false);
		Assert.assertEquals(ResultadoEsperado, resultado);
		
	}
	
	
}

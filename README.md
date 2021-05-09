# Trabalho2


**Trabalho 2 de POO2.**

O Programa faz uma simulação em texto de um jogador se preparando para entrar em campo e realizar suas funções de jogador.

O Programa possui uma classe Principal, Jogador e TemplateMethod . 
No pacote Jogador, possui os métodos com as ações do jogador.
Na classe TemplateMethod, é implementado o Template Method que indica a ordem em que cada método deve ser executado.

O método **VaiJogar();** Faz a comparação da energia do jogador e identifica se o mesmo irá ou não jogar. Caso essa função retorne falso, o programa é finalizado.

o método **SituacaoJogador();** Foi implementado para ser utilizado na simulação de teste do programa.

O método **EntraEmCampo();**  Faz uma simulação do jogador entrando em campo.

O método **Correr();** Faz uma simulação do jogador correndo para a bola.

O método **Chutar();** Faz uma simulação do jogador chutando a bola.

O método **VerificaGol();** Verifica se foi gol ou não. Se a função receber true foi gol, se receber false, não foi gol.
		
O método **Comemora();** Se for gol essa função faz a simulação comemorando o gol.

package basico.exercicios;

import java.util.Scanner;

public class VelhaMatriz {
	int[][] tabuleiro = new int[3][3];
	final int VAZIO = 0;
	final int X = 1;
	final int O = -1;

	/**
	 * Método com a logica de execucao do jogo
	 */
	void jogar() {
		Scanner scan = new Scanner(System.in);
		int vezJogador = X;
		while (!fimDeJogo()) {
			System.out.printf("Vez do jogador %c: ", rep(vezJogador));
			tabuleiro[scan.nextInt()][scan.nextInt()] = vezJogador;
			imprimirTabuleiro();
			vezJogador *= -1;
		}
		int vencedor = vencedor();
		if (vencedor == VAZIO) {
			System.out.println("Jogo Empatado");
		} else {
			System.out.printf("Vencedor é o jogador %c", rep(vencedor));
		}
		scan.close();
	}

	/**
	 * Metodo que retorna se o jogo foi finalizado ou nao. O jogo so e
	 * finalizado se houver um vencedor (X ou O) ou se não houver nenhuma casa
	 * vazia sobrando
	 * 
	 * @return boolean com a resposta
	 */
	boolean fimDeJogo() {
		if (vencedor() == X || vencedor() == O || tabPreenchido()) {
			return true;
		}
		return false;
	}

	/**
	 * Verifica se o tabuleiro foi preenchido, ou seja se ainda há algum campo
	 * vazio (O) ele nao foi preenchido
	 * 
	 * @return boolean com a resposta
	 */
	boolean tabPreenchido() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[0].length; j++) {
				if (tabuleiro[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Se houver, retorna o vencedor da partida, caso contrario retorna o vazio
	 * 
	 * @return int com a resposta
	 */
	int vencedor() {
		if (verificarVencedor(X)) {
			return X;
		}
		if (verificarVencedor(O)) {
			return O;
		}
		return VAZIO;
	}

	/**
	 * Verifica se o vencedor e determinado jogador
	 * 
	 * @param jogador
	 *            e o jogador a ser verificado
	 * @return boolean com a resposta
	 */
	boolean verificarVencedor(int jogador) {
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador
					&& tabuleiro[i][2] == jogador) {
				return true;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador
					&& tabuleiro[2][i] == jogador) {
				return true;
			}
		}
		if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador
				&& tabuleiro[2][2] == jogador) {
			return true;
		}
		if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador
				&& tabuleiro[2][0] == jogador) {
			return true;
		}
		return false;
	}

	/**
	 * Retorna 'X', 'O' ou ' ' de acordo com a representação numerica.
	 * 
	 * @param num
	 *            valor numerico (-1, 0, 1)
	 * @return char com o valor "grafico"
	 */
	char rep(int num) {
		switch (num) {
		case X:
			return 'X';
		case O:
			return 'O';
		default:
			return ' ';
		}
	}

	/**
	 * Representacao "grafica" do tabuleiro
	 * 
	 * @param idx
	 *            indice do tabuleiro (0 a 8)
	 * @return char com o valor "grafico"
	 */
	char tabRep(int i, int j) {
		return rep(tabuleiro[i][j]);
	}

	/**
	 * Método que imprime no console o estado atual do jogo.
	 */
	void imprimirTabuleiro() {
		System.out.printf("%c|%c|%c\n", tabRep(0, 0), tabRep(0, 1),
				tabRep(0, 2));
		System.out.printf("-+-+-\n");
		System.out.printf("%c|%c|%c\n", tabRep(1, 0), tabRep(1, 1),
				tabRep(1, 2));
		System.out.printf("-+-+-\n");
		System.out.printf("%c|%c|%c\n", tabRep(2, 0), tabRep(2, 1),
				tabRep(2, 2));
	}

	public static void main(String[] args) {
		VelhaMatriz velha = new VelhaMatriz();
		velha.jogar();
	}
}

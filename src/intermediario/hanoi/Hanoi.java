package intermediario.hanoi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Hanoi {

	private Torre[] torres = new Torre[3];
	private int numDiscos;
	private Scanner scan = new Scanner(System.in);
	private int movimentos = 0;

	public Hanoi() {
		this(3);
	}

	public Hanoi(int numDiscos) {
		this.numDiscos = numDiscos;
		for (int i = 0; i < torres.length; i++) {
			torres[i] = new Torre();
		}
		for (int i = numDiscos; i > 0; i--) {
			torres[0].adiciona(new Disco(i));
		}
	}

	public void jogar() {
		while (torres[torres.length-1].total() < numDiscos) {
			try {
				visualizar();
				Map movimento = acao();
				Disco mov = torres[(Integer) movimento.get("origem")].remove();
				torres[(Integer) movimento.get("destino")].adiciona(mov);
				movimentos++;
			} catch (IllegalStateException | ArrayIndexOutOfBoundsException ex) {
				mensagemErro();
			}
		}
		mensagemFinal();
		scan.close();
	}

	public void mensagemErro() {
		System.out.println("Movimento não pode ser realizado");
	}

	public void mensagemFinal() {
		visualizar();
		System.out
				.printf("Parabéns você venceu o desafio com %d movimentos!\n",movimentos);
	}

	public Map acao() {
		System.out.print("Digite a origem e o destino (entre 1 e 3): ");
		Map map = new HashMap();
		map.put("origem", scan.nextInt() - 1);
		map.put("destino", scan.nextInt() - 1);
		return map;
	}

	public void visualizar() {
		System.out.println(Arrays.toString(torres));
	}

	public static void main(String[] args) {
		new Hanoi().jogar();
	}
}

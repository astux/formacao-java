package basico.orientacaoobj;

public class Carta {
	int valor;
	String naipe;

	public Carta(int valor, String naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}

	public String toString() {
		String valor = "";
		switch (this.valor) {
		case 1:
			valor = "Ás";
			break;
		case 11:
			valor = "Valete";
			break;
		case 12:
			valor = "Rainha";
			break;
		case 13:
			valor = "Rei";
			break;
		default:
			valor = String.valueOf(this.valor);
			break;
		}

		return String.format("%s de %s", valor, naipe);
	}

	boolean maiorQue(Carta outraCarta) {
		return this.valor > outraCarta.valor;
	}
}

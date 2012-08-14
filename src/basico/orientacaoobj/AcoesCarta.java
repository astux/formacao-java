package basico.orientacaoobj;

public class AcoesCarta {
	int valor;
	String naipe;

	String nomeDaCarta() {
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
	
	boolean maiorQue(AcoesCarta outraCarta){
		return this.valor > outraCarta.valor;
	}
}

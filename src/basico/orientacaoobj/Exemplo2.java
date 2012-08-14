package basico.orientacaoobj;

public class Exemplo2 {

	static void criandoCartas() {
		PropriedadesCarta asDeEspadas = new PropriedadesCarta();
		asDeEspadas.valor = 1;
		asDeEspadas.naipe = "Espadas";

		System.out.printf("Minha carta é %d de %s", asDeEspadas.valor,
				asDeEspadas.naipe);
	}

	static void executandoAcoesDasCartas() {
		AcoesCarta cartaUm = new AcoesCarta();
		cartaUm.valor = 1;
		cartaUm.naipe = "Copas";
		
		AcoesCarta cartaDois = new AcoesCarta();
		cartaDois.valor = 7;
		cartaDois.naipe = "Ouros";
		
		System.out.println(cartaUm.nomeDaCarta());
		System.out.println(cartaDois.nomeDaCarta());
		
		System.out.printf("Carta um maior que carta dois: %b", cartaUm.maiorQue(cartaDois));
	}
}

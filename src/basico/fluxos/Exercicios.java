package basico.fluxos;

public class Exercicios {

	public static void maiorQue() {
		//Dado dois numeros, imprimir o maior numero, somente se ele for impar
	}
	
	public static void nomeDoMes() {
		//dado o numero do mes, imprimir o nome do mes
		int numeroMes = 1;
		String nomeMes = "";
		switch (numeroMes) {
		case 1:
			nomeMes = "Janeiro";
			break;
		case 2:
			nomeMes = "Fevereiro";
			break;
		case 3:
			nomeMes = "Março";
			break;
		case 4:
			nomeMes = "Abril";
			break;
		case 5:
			nomeMes = "Maio";
			break;
		case 6:
			nomeMes = "Junho";
			break;
		case 7:
			nomeMes = "Julho";
			break;
		case 8:
			nomeMes = "Agosto";
			break;
		case 9:
			nomeMes = "Setembro";
			break;
		case 10:
			nomeMes = "Outubro";
			break;
		case 11:
			nomeMes = "Novembro";
			break;
		case 12:
			nomeMes = "Dezembro";
			break;
		default:
			nomeMes = "Mes invalido";
			break;
		}
		
		System.out.println(nomeMes);
	}
	
	public static void inverterString() {
		//dado uma String, inverter o seu nome
		String nome = "Bruce Wayne";
		String invertido = "";
		
		for (int i = nome.length()-1; i >=0 ; i--) {
			invertido += nome.charAt(i);
		}
		
		System.out.println(invertido);
	}
	
	public static void primos() {
		//imprimir n primeiros os numeros primos
		//Nota.: Um numero primo e um numero que e divisivel somente por 1 e por ele mesmo
		int n = 10;
		int contador = 0;
		for (int i = 1; contador < n; i++) {
			//verifica se i e primo
			boolean primo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			//se i for primo incrementa o contador e imprime o valor
			if(primo){
				System.out.println(i);
				contador++;	
			}
		}
	}
	
	public static void fibonacci() {
		//imprimir n primeiros numeros da sequencia fibonacci
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …
		int n = 10;
		int primeiro = 0;
		int incremento = 1;

		for (int i = 0; i < n; i++) {
			if (i != 0) {
				int aux = primeiro + incremento;
				primeiro = incremento;
				incremento = aux;
			}
			System.out.println(primeiro);
		}
	}

}

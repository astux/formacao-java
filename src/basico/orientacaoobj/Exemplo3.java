package basico.orientacaoobj;

public class Exemplo3 {
	static void exemploContas() {
		Banco bb = new Banco("Banco do Brasil");
		Banco houston = new Banco("Bank of Houston");
		Conta contaThiago = new Conta(bb, "1605-5", "50500-9");
		Conta contaBillGates = new Conta(houston, "5966-3", "76584-0");

		contaBillGates.depositar(5000000);
		contaBillGates.transferir(contaThiago, 50000);

		contaBillGates.imprimirExtratoAtual();
	}

	static void exemploRetangulo() {
		Retangulo retangulo = new Retangulo(10, 5);
		System.out.printf("Area eh: %s\n", retangulo.area());
		System.out.printf("Perimetro eh: %s\n", retangulo.perimetro());
		System.out.printf("Retangulo eh: %s\n", retangulo);
	}
}

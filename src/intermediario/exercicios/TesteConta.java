package intermediario.exercicios;

public class TesteConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.02);
		adc.atuar(c);
		adc.atuar(cc);
		adc.atuar(cp);
		
		System.out.printf("Saldo total: %.2f", 
				adc.getSaldoTotal());
	}
}
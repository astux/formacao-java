package intermediario.exercicios;

public class AtualizadorDeContas {
	private double saldoTotal;
	private double selic;

	public AtualizadorDeContas(double taxa) {
		selic = taxa;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void atuar(Conta c) {
		System.out.printf("Saldo anterior %.2f\n", 
				c.getSaldo());
		/*
		 * É importante perceber que estamos sempre usando uma Conta para executar o nosso metodo 'atualizar',
		 * significa que, através dos conceitos do polimorfismo, podemos criar outros tipos de conta, que herdem
		 * de Conta (exemplo: ContaInvestimento), que implemente de sua propria maneira (algumas podendo ser até 
		 * bem complexas). Dessa maneira, o nosso atual metodo 'atuar', não precisaria ser modificado, ele 
		 * simplemente iria executar o novo metodo 'atualizar' da nova implementação.
		 */
		c.atualizar(selic);
		System.out.printf("Saldo posterior %.2f\n", 
				c.getSaldo());
		saldoTotal += c.getSaldo();
	}
}

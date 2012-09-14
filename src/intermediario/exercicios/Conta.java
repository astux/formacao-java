package intermediario.exercicios;

public class Conta {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		// saldo = saldo + valor;
		saldo += valor;
	}

	public void saca(double valor) {
		saldo -= valor;
	}

	public void atualizar(double taxa) {
		saldo = taxa * saldo + saldo;
	}

}

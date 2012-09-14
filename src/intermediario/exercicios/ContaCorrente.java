package intermediario.exercicios;

public class ContaCorrente extends Conta {

	@Override
	public void atualizar(double taxa) {
		//super.atualizar(...)
		saldo = (2 * taxa * saldo) + saldo;
	}

	@Override
	public void deposita(double valor) {
		saldo += (valor - 0.10);
	}
}

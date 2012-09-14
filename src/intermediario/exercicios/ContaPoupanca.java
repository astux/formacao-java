package intermediario.exercicios;

public class ContaPoupanca extends Conta {
	@Override
	public void atualizar(double taxa) {
		saldo = (3 * taxa * saldo) + saldo;
	}
}

package basico.orientacaoobj;

public class Conta {
	double saldo;
	String agencia;
	String contaCorrente;
	Banco banco;

	public Conta(Banco banco, String agencia, String contaCorrente) {
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.banco = banco;
		this.saldo = 0.0;
	}

	void sacar(double valor) {
		this.saldo -= valor;
	}

	void depositar(double valor) {
		this.saldo += valor;
	}

	void transferir(Conta outraConta, double valor) {
		this.sacar(valor);
		outraConta.depositar(valor);
	}

	String extratoAtual() {
		String extrato = String.format("Extrato do %s\n", this.banco);
		extrato += String.format("Na c/c %s da Agencia %s\n",
				this.contaCorrente, this.agencia);
		extrato += String.format("O saldo atual e de %f\n", this.saldo);

		return extrato;
	}

	void imprimirExtratoAtual() {
		System.out.println(extratoAtual());
	}
}

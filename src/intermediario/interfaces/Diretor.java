package intermediario.interfaces;

import intermediario.orientacaoobj.Funcionario;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha;

	public Diretor(String nome) {
		super(nome);
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha != senha) {
			return false;
		}
		return true;
	}

}

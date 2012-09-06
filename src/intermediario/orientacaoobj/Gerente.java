package intermediario.orientacaoobj;

public class Gerente extends Funcionario {

	private Double comissao;
	
	public Gerente(String nome) {
		super(nome);
		this.salario *= 5;
	}

	@Override
	public Double bonificacao() {
		return super.bonificacao() * 2;
	}

}

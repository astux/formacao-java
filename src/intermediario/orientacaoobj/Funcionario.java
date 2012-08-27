package intermediario.orientacaoobj;

public class Funcionario {
	private String nome;
	private Double salario;
	private Empresa empresa;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNome() {
		return nome;
	}

	public boolean estaContratado() {
		return empresa != null;
	}

	public Double bonificacao() {
		return salario * 0.1;
	}

	@Override
	public boolean equals(Object obj) {
		Funcionario other = (Funcionario) obj;
		if (nome.equals(other.nome)) {
			return true;
		}
		return false;
	}

}

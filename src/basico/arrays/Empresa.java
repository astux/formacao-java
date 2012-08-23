package basico.arrays;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;

	public Empresa(String nome, String cnpj, int qtFuncionarios) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new Funcionario[qtFuncionarios];
	}

	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public boolean contratar(Funcionario funcionario) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				funcionarios[i].setEmpresa(this);
				return true;
			}
		}
		return false;
	}

	public boolean demitir(Funcionario funcionario) {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i] != null && funcionarios.equals(funcionarios[i])) {
				funcionarios[i] = null;
				funcionarios[i].setEmpresa(null);
				return true;
			}
		}
		return false;
	}
	
	public double gastoComSalarios(){
		//TODO
		return 0;
	}
	
	public Funcionario encontrarFuncionario(Funcionario funcionario){
		//TODO
		return null;
	}
	
	public boolean funcionarioContratado(Funcionario funcionario){
		//TODO
		return false;
	}
}

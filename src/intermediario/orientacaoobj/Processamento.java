package intermediario.orientacaoobj;

public class Processamento {

	public static void main(String[] args) {
		Empresa dell = new Empresa("Dell", "123", 5);

		Funcionario thiago = new Funcionario("Thiago");
		thiago.setSalario(1000.0);
		
		Funcionario bruno = new Funcionario("Bruno");
		bruno.setSalario(5000.0);
		
		dell.contratar(thiago);
		dell.contratar(bruno);
		
		System.out.printf("Despesa com salarios e de: %.2f\n", dell.gastoComSalarios());
		
		dell.demitir(thiago);
		
		System.out.printf("Despesa com salarios e de: %.2f\n", dell.gastoComSalarios());
		
		boolean contratado = dell.contratar(thiago);
		System.out.printf("Contratado? %b", contratado);
	}

}

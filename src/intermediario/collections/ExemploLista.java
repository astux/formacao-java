package intermediario.collections;

import intermediario.orientacaoobj.Funcionario;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ExemploLista {
	public static void main(String[] args) {
		List lista = new LinkedList();
		lista.add(new Funcionario("Diego"));
		lista.add(new Funcionario("Ricardo"));
		lista.add(new Funcionario("Alex"));
		lista.add(new Funcionario("Carlos"));
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);

		for (Object elemento : lista) {
			if (elemento instanceof String) {
				String aux = (String) elemento;
				System.out.println(aux.length());
			}
		}

		System.out.println("Tamanho da lista: " + lista.size());
		System.out.println(lista);
		System.out.println("Tamanho: "+lista.size());
		lista.remove(0);
		System.out.println(lista);
		System.out.println("Tamanho: "+lista.size());
		lista.set(2, "novo elemento");
		System.out.println(lista);
		System.out.println("Tamanho: "+lista.size());
		System.out.println(lista.indexOf("novo elemento"));
	}
}

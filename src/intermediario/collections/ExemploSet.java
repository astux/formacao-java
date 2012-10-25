package intermediario.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		teriaConjuntos();
	}
	
	public static void teriaConjuntos(){
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new TreeSet<>();
		
		a.add(8);
		a.add(3);
		a.add(1);
		
		b.add(8);
		b.add(7);
		b.add(5);
		a.removeAll(b);
		System.out.println(a);
		//System.out.println(b);
	}
	
	public void helloSet(){
		Set cartucho = new LinkedHashSet();
		AcoplarSet acoplar = new AcoplarSet(cartucho);
		acoplar.imprimeConjunto();
		
		/*Set conjunto = new TreeSet();
		conjunto.add(2);
		conjunto.add(7);
		conjunto.add(4);
		conjunto.add(101);
		conjunto.add(4);
		//conjunto.add("teste");
		System.out.println(conjunto);*/

		/*Integer soma = 0;
		for (Object o : conjunto) {
			soma += (Integer) o;
		}
		System.out.println(soma);*/
	}
}

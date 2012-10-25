package intermediario.collections;

import java.util.Set;
import java.util.TreeSet;

public class AcoplarSet {
	private Set conjunto;
	
	public AcoplarSet(Set cartucho) {
		conjunto = cartucho;
	}
	
	void imprimeConjunto(){
		conjunto.add(2);
		conjunto.add(7);
		conjunto.add(4);
		conjunto.add(101);
		conjunto.add(4);
		System.out.println(conjunto);
	}
}

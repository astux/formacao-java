package intermediario.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
	public static void main(String[] args) {
		Map mapa = new LinkedHashMap();
		
		mapa.put("nome", new ArrayList<String>());
		//mapa.put("idade", 30);
		//mapa.put("empresa", "Astux");

		//mapa.get("nome").add("Thiago");
		//mapa.get("nome").add("Oliveira");
		
		for (Object o : mapa.keySet()) {
			System.out.println(o + " => " + mapa.get(o));
		}
		//System.out.println();
	}
}

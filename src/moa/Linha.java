package moa;

import java.util.HashMap;
import java.util.Map;

public class Linha {
	
	static Map<Integer, Linha> linhas = new HashMap<Integer, Linha>();
	
	static Linha newInstance(Integer value){
		if(linhas.containsKey(value))
			return linhas.get(value);
		
		Linha linha = new Linha(value);
		linhas.put(value, linha);
		return linha;
	}
	
	private Linha(Integer value){
		this.numero = value;
	}
	
	Integer numero;

}

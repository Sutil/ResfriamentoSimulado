package moa;

import java.util.List;

public class Coluna {
	
	int numero;
	double custo;
	List<Linha> linhasCobertas;
	
	public Coluna(int numero, double custo, List<Linha> linhasCobertas) {
		this.numero = numero;
		this.custo = custo;
		this.linhasCobertas = linhasCobertas;
	}
	
}

package moa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Builder {
	
	public void build(String path) throws FileNotFoundException{
		Map<Integer, Coluna> colunas = new HashMap<Integer, Coluna>();
		
		Scanner scanner = new Scanner(new FileInputStream(path));
		if(!scanner.hasNext()){
			scanner.close();
			return;
		}
					
		scanner.nextInt(); // numero de linhas
		int nColunas = scanner.nextInt();
		scanner.nextLine(); // descarta linha não utilizada
		
		while(scanner.hasNext()){
			Coluna coluna = montaColuna(scanner.nextLine());
			colunas.put(coluna.numero, coluna);
		}
		
		scanner.close();
		
		if(colunas.size() != nColunas)
			throw new RuntimeException("número de colunas lidas está incorreto");
	}

	private Coluna montaColuna(String nextLine) {
		Scanner scanner = new Scanner(nextLine);
		if(!scanner.hasNext()){
			scanner.close();
			return null;
		}
		
		int numerocoluna = scanner.nextInt();
		double custo = scanner.nextDouble();
		List<Linha> linhas = new ArrayList<Linha>();
		while(scanner.hasNext())
			linhas.add(Linha.newInstance(scanner.nextInt()));
		
		scanner.close();
		return new Coluna(numerocoluna, custo, linhas);
	}

}

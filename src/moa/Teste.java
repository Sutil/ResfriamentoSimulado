package moa;

import java.io.FileNotFoundException;

import org.junit.Test;

public class Teste {
	
	@Test
	public void caso1() throws FileNotFoundException{
		String path = getClass().getResource("/moa/caso1").getPath();
		System.out.println(path);
		new Builder().build(path);
	}

}

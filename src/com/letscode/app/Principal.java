package com.letscode.app;

import java.util.ArrayList;
import java.util.List;

import com.letscode.model.AtoresEAtrizes;
import com.letscode.util.Leitor;
import com.letscode.util.Metodos;

public class Principal {
	public static void main(String[] args) {
		Leitor leitor= new Leitor();
		//List<AtoresEAtrizes>registrosAtores= leitor.converter("D:\\Desktop\\aaa.csv");
		List<AtoresEAtrizes>registrosAtrizes= leitor.converter("D:\\Downloads\\837c3265-e2c0-4625-b76e-da09968ccaeb.csv");// colocar o caminho do arquivo
		
		//List<AtoresEAtrizes> todosAtoresEAtrizes = new ArrayList();
		//todosAtoresEAtrizes.addAll(registrosAtores);
		//todosAtoresEAtrizes.addAll(registrosAtrizes);
	
		
		Metodos met= new Metodos();
	met.AtorMaisJovemGanharOscar(registrosAtrizes);
	//	met.AtrizMaisPremiada(registrosAtrizes);
		met.Dados(registrosAtrizes, "Daniel Day-Lewis");

	}
}

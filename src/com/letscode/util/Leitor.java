package com.letscode.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.letscode.model.AtoresEAtrizes;

public class Leitor {
	private List<String> ler(String caminhoArquivo) {
		 try {
	            //List<String> dados = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);//buscar o caminho do arquivo e ler
	            List<String> dados = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
	            return dados;
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
		
	}
	
	
	
	public List<AtoresEAtrizes> converter(String caminhoArquivo) {
		 List<String> dados= ler(caminhoArquivo);
		 List<AtoresEAtrizes>registros= new ArrayList();
		 for(String linha: dados) {
			 String [] campos= linha.split(";");
			 AtoresEAtrizes registro= new AtoresEAtrizes();
			
			 registro.setIndex(Integer.parseInt(campos[0]));
			 registro.setYear(Integer.parseInt(campos[1]));
			 registro.setAge(Integer.parseInt (campos[2]));
			 registro.setName(campos[3].trim());
			 registro.setMovie(campos[4].trim());
			 registros.add(registro);
		 }
		 
		return registros;
	}
	
	
}

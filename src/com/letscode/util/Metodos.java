package com.letscode.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.letscode.model.AtoresEAtrizes;

public class Metodos {
	
	//1 questao- Ator Mais Jovem
	
	 public String  AtorMaisJovemGanharOscar(List<AtoresEAtrizes> listAtores){
		 
		String name= listAtores.stream()
				 .min(Comparator.comparingInt(AtoresEAtrizes::getAge))
				 .get().getName();
		
		 
	 System.out.println("Ator mais jovem: " + name);
	 return name;
	        
		
	    }
	 
	 
	 //2 Atriz que mais ganhou
	 
	// ???
	 
	 
	 
	 //3  Atriz com 20 a 30 anos que mais ganhou
	 
	 public void  AtrizMaisPremiada(List<AtoresEAtrizes> listAtrizes){
		 
	listAtrizes.stream()
					 .filter(a -> a.getAge() >=20 && a.getAge() <=30)
					 .forEach(a-> System.out.println(a.getName() + a.getMovie()+ a.getAge()));
		
		        
			
		    }
	 
	 
	 //4 todos que ganharam mais de um premio
	 // ??
	 

	 // 5 dados de todos
	 public void  Dados(List<AtoresEAtrizes> listAtrizes, String name){
	
		 List<AtoresEAtrizes> teste= new ArrayList<AtoresEAtrizes>();
		 for (AtoresEAtrizes a: listAtrizes) {
			 if(a.getName().equals(name)) {
				teste.add(a);
							 }
					 
		 }
		 System.out.println();
		teste.stream()
		.forEach(a-> System.out.println(a.getName() + a.getMovie()+ a.getAge()));
			
					
				    }

}

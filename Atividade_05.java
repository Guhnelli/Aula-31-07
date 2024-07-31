package Aula_31_07;

import java.util.ArrayList;

public class Atividade_05 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes  = new ArrayList<>(3);
		try {
		
		nomes.add("Ana");
		nomes.add("Bia");
		nomes.add("Caio");
		
		System.out.println("nomes: " + nomes.get(2));
		
		}
		catch (Exception erro) {
			System.out.println("usar elentos");
			System.exit(0);
		}
		
		
	}
		
	
}
	


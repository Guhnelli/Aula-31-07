package Aula_31_07;

import java.util.Scanner;

public class Atividade_06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double x;
		try {
		
		System.out.print("informe a nota:");
		x = ler.nextDouble();
		
		if (x>=6 && x<=10) {
			System.out.println("voce esta aprovada");
		}
		else if (x<6 && x>=4) {
			System.out.println("exame");
		}
		else {
			System.out.println("Reprovado");
		}
		}
		catch (Exception erro) {
			System.out.println("usar apenas numeros");
			
		}
		ler.close();	
	}

}

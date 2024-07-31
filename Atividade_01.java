package Aula_31_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> numeros  = new ArrayList<>();
		int soma=0;
		int numero=0;
		
		for( int i = 1; i <= 5; i++) {
			System.out.print(" informe o numero : " + i +" ");
			numero = ler.nextInt();
			soma=(soma+numero);
				
		}
		System.out.println(" ");	
		System.out.println("A soma é : " + soma);	
					
		
		
	}
	
}


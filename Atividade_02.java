package Aula_31_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {


		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> numeros  = new ArrayList<>();

		int i=1;

		while (i != 0) {

			System.out.println("Informe o valor a ser somado: ");
			i = ler.nextInt();
			if (i!= 0) {
				numeros.add(i);

			}
			for (int numero: numeros) {
				if ( numero%2==0) {
					System.out.println(numero);
				}
			}
		}
	}
}


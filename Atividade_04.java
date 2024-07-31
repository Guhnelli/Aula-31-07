package Aula_31_07;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int a=0, b=0;
		try {

		System.out.print("informe o primeiro numero:");
		a = ler.nextInt();

		System.out.print("informe o primeiro numero:");
		b = ler.nextInt();
	
		System.out.println("resultado");
		System.out.println("Soma: " +(a+b));
		System.out.println("sub: " + (a-b));
		System.out.println("mult: " + (a*b));
		System.out.println("divi: " + (a/b));
		System.out.println("divi exata: " + ((double)a/b));
		System.out.println("divi inteira: " + (a % b));
		ler.close();
		}
		catch (Exception erro) {
			System.out.println("informe um valor do tipo inteiro");
			System.exit(0);
		}
	}

}

package javaInicial;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		int x,somaPositivos=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		x = leia.nextInt();
		do {
			System.out.println("Digite um número inteiro: ");
			x = leia.nextInt();
			if(x>0) {
			somaPositivos = somaPositivos + x;
			}
	
}while(x!=0);
		System.out.println("A soma dos números positivos é: "+somaPositivos+".");
		
}
}

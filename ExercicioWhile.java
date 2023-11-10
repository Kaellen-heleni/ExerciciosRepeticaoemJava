package javaInicial;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		int idade,menorIdade=0,maiorIdade=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a idade:");
		idade = leia.nextInt();
		
		
		while (idade>0) {
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
			if(idade<21) {
				menorIdade++;
				}
			if(idade>50) {
				maiorIdade++;
			}
				
			}
	
        System.out.println("O total de pessoas maior de idade é: "+maiorIdade+".");
        System.out.println("O total de pessoas menor de idade é: "+menorIdade+".");
	}
}


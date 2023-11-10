package javaInicial;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		int qtdPares=0,qtdImpar=0,x,num;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe 10 números inteiros: ");
		
		 for (x=0;x<10;x++){
		 System.out.println("\nNúmero "+(x+1)+":");
		 num = leia.nextInt();
		 
		 if (num % 2 ==0) {
			 qtdPares++;
		 }else {
			 qtdImpar++;
		 }
		 	}
		
	System.out.println("A quantidade de números pares é: "+qtdPares+".");
	System.out.println("A quantidade de números ímpares é: "+qtdImpar+".");

	}
}



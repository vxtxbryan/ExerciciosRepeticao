package br.com.generation.exercicios;

import java.util.Scanner;

public class ExerciciosRepeticao05 {

	public static void main(String[] args) {
 
	Scanner leia = new Scanner(System.in);	
		
	int num, soma = 0;	
			
	
		
	System.out.printf("Digite um numero: ");
	num = leia.nextInt();
	
	
	soma += num;
	while(num != 0);
	System.out.printf("Soma = %d", soma);
	
	
	leia.close();
	
	}	
	
}



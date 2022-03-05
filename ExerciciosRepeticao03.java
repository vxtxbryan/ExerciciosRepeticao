package br.com.generation.exercicios;

import java.util.Scanner;

public class ExerciciosRepeticao03 {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);	
		
	int idade = 0, idade21 = 0, idade50 = 0;
	
	System.out.printf("Programa\n Informe idade 99 para parar\n\n ");
	while(idade <= 98) {
	System.out.printf("Digite sua idade: ");
	idade = leia.nextInt();
	if(idade<21) { idade21=idade21+1;}
	if(idade>50) { idade50=idade50+1;}
	}
	System.out.println(" Idade menor que 21: " + idade21);
	System.out.println(" Idade maior que 50: " + idade50);
	
	leia.close();
		
		
		
	}

}


package br.com.generation.exercicios;

import java.util.Scanner;

public class ExerciciosRepeticao02 {

	public static void main(String[] args) {

	Scanner l = new Scanner(System.in);	
	int  par = 0, impar = 0;
	int lista[] = new int [10];
	
	for(int cont = 0, num; cont < 10; cont++) {
		
		 System.out.print("Informe o " + (cont +1) + "� n�mero: ");
	num = l.nextInt();
	lista[cont] = num;
	if(num % 2 == 0) {
		par++;
	}
	else {
		impar++;
	}
		 
	}	
	System.out.println("N�meros pares: " + par );	 
	System.out.println("N�meros impares: " + impar);	 

	l.close();
}
}

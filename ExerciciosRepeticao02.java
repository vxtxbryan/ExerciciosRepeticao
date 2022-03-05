package br.com.generation.exercicios;

import java.util.Scanner;

public class ExerciciosRepeticao02 {

	public static void main(String[] args) {

	Scanner l = new Scanner(System.in);	
	int  par = 0, impar = 0;
	int lista[] = new int [10];
	
	for(int cont = 0, num; cont < 10; cont++) {
		
		 System.out.print("Informe o " + (cont +1) + "º número: ");
	num = l.nextInt();
	lista[cont] = num;
	if(num % 2 == 0) {
		par++;
	}
	else {
		impar++;
	}
		 
	}	
	System.out.println("Números pares: " + par );	 
	System.out.println("Números impares: " + impar);	 

	l.close();
}
}

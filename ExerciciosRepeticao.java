package br.com.generation.exercicios;

public class ExerciciosRepeticao {

	public static void main(String[] args) throws InterruptedException {

	for(int n = 1000; n <= 1999; n++) {
        if (n % 11 == 5) {	 
        System.out.printf("== %d/11 Tem como resto 5\n" ,n);
        }	
	}
		System.out.println("\nPrograma encerrado!");	
	}

}

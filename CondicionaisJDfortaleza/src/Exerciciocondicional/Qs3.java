package Exerciciocondicional;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Qs3 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
		Scanner leitor = new Scanner(System.in);
		try {
			  
			
		int n1, n2, n3;
		
		System.out.println("Digite os numeros");
		
		n1 = leitor.nextInt();
		n2 = leitor.nextInt();
		n3 = leitor.nextInt();
		
		
		if(n1>n2 && n1>n3 ) {
			System.out.println("o numero maior �" + n1);
		}
			
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O numero maior � " + n2);

	}else if(n3 > n1 && n3 > n2) {
		System.out.println("O numero maior � "+ n3);
		
	}else {
		System.out.println("valor invalido");
	}
		} catch (InputMismatchException e) {
			System.out.println("invalido");
		}
			
		
	}
}

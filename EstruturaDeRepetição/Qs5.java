package EstruturaDeRepeti��o;

import java.util.Scanner;

public class Qs5 {

	public static void main(String[] args) {
		// Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite os 5 numeros");
		int soma = 0;
		
		for(int i = 1; i<=5 ; i++) {
			
			soma+=leitor.nextInt();
		}
		
		System.out.println("a soma �: " + soma + "\n" +"a media �: "+ soma/5);
		
	}

}

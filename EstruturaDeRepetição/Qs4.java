package EstruturaDeRepeti��o;

import java.util.Scanner;

public class Qs4 {

	public static void main(String[] args) {
		//  Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
		Scanner leitor = new Scanner(System.in);
		int n1=0;
		int maior =0;
		int menor =9999;
		System.out.println("digite os 5 numeros");
		
		
		for (int i = 1; i<=5; i++) {
			
			n1 = leitor.nextInt();
			
			if(maior<n1) {
				 maior = n1;
				 
			}else if (menor > n1) {
				System.out.println("digite um numero positivo");
				break;
			}
			
	
		}
		System.out.println("o numero maior foi: "+ maior);
	}
}

package EstruturaDeRepeti��o;

import java.util.Scanner;

public class Qs3 {

	public static void main(String[] args) {
		// Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no
		//intervalo compreendido por eles.
		
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite os dois numeros: ");
			int n1 = 0;
			int n2= 0;
			n1  = leitor.nextInt();
			n2  = leitor.nextInt();
			
			for (int i = n1+1 ; i<n2;i++) {
				
				System.out.println(i);
				
				
			}
			
		

	}

}

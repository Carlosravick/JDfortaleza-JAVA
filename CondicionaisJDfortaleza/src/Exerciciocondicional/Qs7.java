package Exerciciocondicional;

import java.util.Scanner;

public class Qs7 {	

	// Fa�a um Programa que leia tr�s
	//n�meros e mostre o maior e o menor deles.
	public static void main(String[] args) {

	Scanner leitor = new Scanner(System.in);
	int n1,n2,n3;
	int maior=0;
	int menor=0;
 
	System.out.println("Digite aqui o seu primeiro n�mero: ");
	n1 = leitor.nextInt();
	System.out.println("Digite agora o seu segundo n�mero: ");
	n2 = leitor.nextInt();
	System.out.println("e agora o terceiro n�mero: ");
	n3 = leitor.nextInt();
	
	if(n1>n2) {
		maior = n1;
	}else {
		maior = n2 ;
	}if (n3>maior) {
		maior = n3;
	}if(n1<n2) {
			menor = n1;
		}else {
			menor = n2;
		}if (n3<menor) {
			menor = n3;
		}
	System.out.println("o numero maior �: " + maior+" o numero menor �: "+ menor );
	}
	
	
}






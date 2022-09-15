package Questao6;

import java.util.Scanner;

public class Qst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1 = 0;
		float n2 = 0 ;
		float n3 = 0 ;
		
		for (float i = 1 ; i<=3 ; i++) {
			if(i==1) {
			System.out.println("Quanto você ganha por horas? ");
			Scanner valor1 =  new Scanner (System.in);
			 n1 = valor1.nextFloat();
			}
			
			else if (i==2) {
			System.out.println("quantos horas trabalha por dia? ");
			Scanner valor2 =  new Scanner (System.in);
			 n2 = valor2.nextFloat();
			}
		   else if(i==3) {
			System.out.println("quantas dia da semana trabalha? ");
			Scanner valor3 =  new Scanner (System.in);
			 n3 = valor3.nextFloat();
			}
			
			
			
			
			
			
			
	}
		System.out.println("o salario do seu mês é : " + (n1 * n2 * n3)*4 );
			
	}

}
	

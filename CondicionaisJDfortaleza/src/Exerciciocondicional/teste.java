package Exerciciocondicional;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.NA;

public class teste {

	public static void main(String[] args) {
		//String myStr = "Hello";
		//System.out.println(myStr.replace('l', 'p'));
		
	        // Faça um Programa que leia três números e mostre o maior deles.
	       
			Scanner leitor = new Scanner(System.in);
	        try {
	            double n1, n2, n3;
	            System.out.println("Digite os numero com virgula");
	            n1 = leitor.nextDouble();
	            n2 = leitor.nextDouble();
	            n3 = leitor.nextDouble();
	            if(n1<n2 && n1<n3 ) {
	                System.out.println("o numero menor é" + n1);
	            }
	            else if(n2 < n1 && n2<n3) {
	                System.out.println("O numero menor é " + n2);
	            }else if(n3<n1 && n3<n2) {
	                System.out.println("O numero menor é "+ n3);
	            }else {
	                System.out.println("valor invalido");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Seu retardado eu falei pra colocar virgula");
	        }
	    }

	}



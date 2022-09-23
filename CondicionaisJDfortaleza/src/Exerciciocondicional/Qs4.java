package Exerciciocondicional;

import java.util.Scanner;

public class Qs4 {

	 public static void main(String[] args) {
	        String Sexo;
	        Scanner leitor = new Scanner(System.in);
	        System.out.println("Qual o seu sexo? Digite M OU F :");
	        Sexo = leitor.nextLine();
	        switch (Sexo.toLowerCase()){
	            case "m":
	                System.out.println("Sexo: Masculino");
	                break;
	            case "f":
	                System.out.println("Sexo: Feminino");
	                break;
	            default:
	                System.out.println("Sexo inválido!!");
	        }
	    }
}

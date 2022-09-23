package Exerciciocondicional;


import java.util.Scanner;


public class Qs5 {

	public static void main(String[] args) {
	
    Scanner input = new Scanner(System.in);
    System.out.println("Digite seu turno: ");
    String turno = input.nextLine(); 


switch(turno.toUpperCase()){
    case "M":
        System.out.println("Seu turno é matutino, Bom dia!");
        break;

    case "V":
        System.out.println("Seu turno é Vespertino, Boa tarde!");
        break;

    case "N":
        System.out.println("Seu turno é noturno, Boa Noite!");
        break;

    default:
        System.out.println("Turno Invalido");
        break;

        }
    }


	}



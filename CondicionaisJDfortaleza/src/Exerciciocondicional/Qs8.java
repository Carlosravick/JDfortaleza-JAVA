package Exerciciocondicional;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Qs8 {

	    public static void main(String[] args) {
	        try{
	            int i = 1;
	            double soma = 0;
	            double n1;
	            double media;
	            Scanner leitor = new Scanner(System.in);
	            do{
	                System.out.println("digite o valor da " + i + "�" + " nota: ");
	                n1 = leitor.nextDouble();
	                if(n1 < 0){
	                    System.out.println("Digite valores maiores que zero!");
	                    break;
	                }else if(n1>10){
	                    System.out.println("Digita notas de 0 a 10!");
	                    break;
	                }else{
	                    i++;
	                    soma += n1;
	                    media = soma / 4;
	                    if (i == 5) {
	                        System.out.println("Sua m�dia �:" + media);
	                        if (media == 10) {
	                            System.out.printf("Aprovado com Distin��o! Parab�ns!! sua m�dia � %s !", media);
	                        } else if (media >= 7 && media < 10) {
	                            System.out.println("Parab�ns, Vo�� foi Aprovado!");

	                        }else if (media < 7 && media >= 0) {
	                            System.out.println("Infelizmente voc� foi reprovado!");
	                        }else{
	                            System.out.println("Digite uma nota v�lida!");
	                        }
	                    } else {
	                    }
	                }
	            }
	            while (i <= 4);
	        }catch (InputMismatchException e){
	                System.out.println("por favor, digite notas v�lidas!");
	        }
	    }
	}

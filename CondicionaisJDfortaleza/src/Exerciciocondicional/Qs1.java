package Exerciciocondicional;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Qs1 {
    public static void main(String[] args) {
        try {
            double n1, n2;
            System.out.println("digite o primeiro valor: ");
            Scanner leitor = new Scanner(System.in);
            n1 = leitor.nextDouble();
            System.out.println("digite o segundo valor: ");
            n2 = leitor.nextDouble();
            if (n2 > n1) {
                System.out.printf("%s é o maior valor!", n2);
            } else if (n1 > n2) {
                System.out.printf("%s é o maior valor!", n1);
            } else if (n1 == n2) {
                System.out.printf("Não existe valor maior ou menor!");
            } else {
                System.out.println("digite numeros válidos");
            }
        }catch(InputMismatchException e){
            System.out.println("Digite números válidos!");
        }
    }
}

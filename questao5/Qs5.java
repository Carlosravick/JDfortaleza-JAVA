package questao5;

import java.util.Scanner;

public class Qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Digite o numero");
		Scanner input1 = new Scanner(System.in);
		int n1 = input1.nextInt();
		int antecessor = n1 - 1;
		int sucessor = n1 + 1;
		System.out.println("o seu antecessor ? : " + antecessor + " e o seu sucessor ? :  " + sucessor);
		
	}

}

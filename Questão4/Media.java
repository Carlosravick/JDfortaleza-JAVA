


package Qts4;

import java.util.Scanner;


public class Media {

	public static void main(String[] args) {
	float media = 0;

	
	for (float i = 1 ; i <= 4 ; i++) {
		
		System.out.println("Digite um valor");
		Scanner input1 = new Scanner(System.in);
		float n1 = input1.nextFloat();	
		 
		media += n1 ;
		
		if (i == 4) {
			System.out.println("sua media é " + media / 4);
		}
		
	}
	
	
	

	


}
}


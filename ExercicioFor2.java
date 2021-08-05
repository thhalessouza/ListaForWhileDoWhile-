package ExerciciosListaForWhileDoWhile;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		 {
		
		int numero, contPar = 0, contImpar = 0 ; 
		
		for(int i = 1; i <=10 ; i++ ) {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			
			
			if(numero % 2 ==0) {
				contPar++;
			}
			
			if(numero% 2 ==1) {
				contImpar++;
				
			}
			
			System.out.println("A quantidade de números pares é: " + contPar);
			System.out.println("A quantidade de números ímpares é: " + contImpar);
			
			ler.close();

	}

		 }
		 
	}
}

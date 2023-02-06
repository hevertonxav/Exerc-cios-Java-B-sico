
/*Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/



package curso.java.heverton;

import java.util.Scanner;

public class CalculosNumeros {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número: ");
		int n2 = scan.nextInt();
		
		System.out.println("Entre com o terceiro número: ");
		double n3 = scan.nextDouble();
		
		
		
		/*Cálculo do produto do dobro do primeiro com metade do segundo número,
		vamos chama-lo de calculo1. */
		
		double calculo1 = (2*n1)*(0.5*n2); 
		
		/*Cálculo da soma do triplo do primeiro com o terceiro, 
		vamos chama-lo de calculo2.*/
		
		double calculo2 = 3 * n1 + n3;
		
		// Cálculo do terceiro elevado ao cubo, vamos chama-lo de calculo3.
		
		double calculo3 = Math.pow(n3, 3);
		
		
		//Mostra dos resultados
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + calculo1);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + calculo2);
		System.out.println("O terceiro elevado ao cubo: " + calculo3);
		
		
	}

}

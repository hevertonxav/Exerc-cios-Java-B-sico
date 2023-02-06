
//Faça um Programa que converta metros para centímetros.


package curso.java.heverton;

import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a medida em metros: ");
		double medidaMetros = scan.nextDouble();
		
		Double medidaCentimetros = medidaMetros*100;
		
		
		System.out.println("A medida é " + 	medidaCentimetros.intValue() + " cm.");
		
	}


}

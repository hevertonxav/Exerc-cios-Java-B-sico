
/*Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.*/


package curso.java.heverton;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do círculo: ");
		double raio = scan.nextDouble();
		
		double area = Math.pow(raio, 2)*Math.PI;
		
		System.out.printf("Área do circulo: %.2f ", area);
		
	}

}

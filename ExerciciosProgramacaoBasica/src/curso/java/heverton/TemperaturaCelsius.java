
/*Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).*/


package curso.java.heverton;

import java.util.Scanner;

public class TemperaturaCelsius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a temperatura em graus Farenheit: ");
		double temperaturaF = scan.nextDouble();
		
		double temperaturaC = (5 * (temperaturaF - 32))/9;
		
		System.out.println("A temperatura  é " + temperaturaC + "°C");
		
	}

}

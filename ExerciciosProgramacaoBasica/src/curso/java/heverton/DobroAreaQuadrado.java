
/*Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.*/

package curso.java.heverton;

import java.util.Scanner;

public class DobroAreaQuadrado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a medida do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		System.out.println("A área do quadrado é " + area );
		
	    double dobroArea = 2*area;
	    
		System.out.println("e o dobro dela é " + dobroArea);

	}

}

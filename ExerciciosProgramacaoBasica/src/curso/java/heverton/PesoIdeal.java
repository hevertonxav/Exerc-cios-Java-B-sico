
/*Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58.*/


package curso.java.heverton;

import java.util.Scanner;

public class PesoIdeal {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a altura da pessoa: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7*altura) - 58;
		
		System.out.printf("O peso ideal é %.3f ", pesoIdeal);
        System.out.print("kg");
	}

}

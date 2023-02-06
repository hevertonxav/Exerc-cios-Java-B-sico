
//Faça um Programa que peça as 4 notas bimestrais e mostre a média.


package curso.java.heverton;

import java.util.Scanner;

public class MediaNotasBimestrais {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a nota do primeiro bimestre: ");
	    nota1 = scan.nextDouble();
		
		System.out.println("Informe a nota do segundo bimestre: ");
		nota2 = scan.nextDouble();
		
		System.out.println("Informe a nota do terceiro bimestre: ");
		nota3 = scan.nextDouble();
		
		System.out.println("Informe a nota do quarto bimestre: ");
		nota4 = scan.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média final é " + media);
		
	
	}

}

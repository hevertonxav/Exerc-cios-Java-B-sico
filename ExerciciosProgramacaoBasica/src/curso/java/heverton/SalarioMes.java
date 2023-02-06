
/*Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.*/



package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioMes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quanto horas você trabalhou nesse mês? ");
		double horasTrabalhadas = scan.nextDouble();
		

		
		double salario = valorHora * horasTrabalhadas;
		DecimalFormat df = new DecimalFormat("####.00");
		
		System.out.println("O seu salário total nesse mês é de R$ " + df.format(salario));
		
		

	}

}

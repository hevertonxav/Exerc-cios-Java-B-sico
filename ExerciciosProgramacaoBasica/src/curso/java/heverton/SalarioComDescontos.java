
/*Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela
abaixo:

+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$

Obs.: Salário Bruto - Descontos = Salário Líquido.*/


package curso.java.heverton;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioComDescontos {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quanto horas você trabalhou nesse mês? ");
		double horasTrabalhadas = scan.nextDouble();
		
		//cálculo do salário bruto
		double salarioBruto = valorHora*horasTrabalhadas;
		
		//cálculo do desconto do INSS
		double inss = 0.08*salarioBruto;
		
		//cálculo do desconto do sindicato
		double sind = 0.05*salarioBruto;
		
		//cálculo do desconto do IR
		double ir = 0.11*salarioBruto;
		
		//cálculo do desconto total
		double descontoTotal = inss + sind + ir;
		
		//cálculo do salário líquido
		double salarioLiquido = salarioBruto - descontoTotal;
		
		DecimalFormat df = new DecimalFormat("#####.00");
		
		System.out.println("Salário Bruto: R$ " + df.format(salarioBruto));
		System.out.println("INSS: R$ " + df.format(inss));
		System.out.println("Sindicato: R$ " + df.format(sind));
		System.out.println("Salário Líquido: R$ " + df.format(salarioLiquido));
		
	}

}

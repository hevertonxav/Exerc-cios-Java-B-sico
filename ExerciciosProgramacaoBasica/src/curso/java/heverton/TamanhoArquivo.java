
/*Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/



package curso.java.heverton;

import java.util.Scanner;

public class TamanhoArquivo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade em Mbps: ");
		double velInternet = scan.nextDouble();
		
		
		double tempoSeg = (tamArquivo / velInternet);//tempo em segundos
		
		double tempoMin = tempoSeg/60; // tempo em minutos
		
		
		System.out.printf("Tempo download: %.2f ", tempoMin);
		System.out.println("minutos");
		
		

	}

}

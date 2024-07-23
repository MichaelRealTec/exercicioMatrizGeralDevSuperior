package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// exercicioMatrizGeralDevSuperior
		
		int n, linha, coluna;
		double somaPositivo = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double[][] matriz = new double[n][n];
		double[] vetor = new double[n];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ",i,j);
				matriz[i][j] = sc.nextDouble();
				if(matriz[i][j] > 0) {
					somaPositivo += matriz[i][j];
				}
			}
		}
		
		//Soma dos positivos
		System.out.println();
		System.out.printf("SOMA DOS POSITIVOS: %.1f\n", somaPositivo);
		System.out.println();
		
		//Imprimir elementos de uma linha
		System.out.print("Escolha uma linha: ");
		linha = sc.nextInt();
		System.out.print("LINHA ESCOLHIDA: ");
	
		
		for(int j = 0; j < n; j++) {
			System.out.printf("%.1f ", matriz[linha][j]);			
		}
		System.out.println();
		
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		coluna = sc.nextInt();
		System.out.print("COLUNA ESCOLHIDA: ");

		
		for(int i = 0; i < n; i++) {
			System.out.printf("%.1f ", matriz[i][coluna]);
		}
		
		// Diagonal principal
		System.out.println();
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%.1f ",matriz[i][i]);
		}
		
		// Matriz alterada (Elevar ao quadro todos os negativos)
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(matriz[i][j] < 0) {
					matriz[i][j] = matriz[i][j] * matriz[i][j];
				}
			}
		}
		
		// Imprimir matriz alterada
		System.out.println();
		System.out.println();
		System.out.print("MATRIZ ALTERADA:");
		for(int i = 0; i < n; i++) {
			System.out.println();
			for(int j = 0; j < n; j++) {
				System.out.printf("%.1f ",matriz[i][j]);
			}
		}		
		
		sc.close();
	}

}

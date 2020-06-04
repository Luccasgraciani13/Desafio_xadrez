import java.util.Scanner;
public class Desafio {

	public static void main(String[] args) {

		int linha = 0, coluna = 0;
		
		
		 System.out.printf("Movimentos de uma Torre no xadrez!\n");
		 System.out.printf("Digite a linha em que a Torre se encontra: ");
		  
		 try (var scanner = new Scanner(System.in)) {
			linha = scanner.nextInt(linha);
		}
			System.out.println("Digite a coluna em que a Torre se encontra: ");
		 try (var scanner1 = new Scanner(System.in)) {
			coluna = scanner1.nextInt(coluna);
		}
			System.out.println("\nMovimentos possíveis:\n\n");
		 System.out.println(" 1 2 3 4 5 6 7 8 \n");
		 System.out.println(" ------------------------\n");
		
	
		 for (int l = 1; l <= 8; l++) {
		 System.out.println(l);
		 for (int c = 1; c <= 8; c++) {
		 if (l == linha || c == coluna) {
			 System.out.println(" x ");
		 }
		 else {
			 System.out.println(" - ");
		 }
		 }
		 System.out.println("\n");
		 }
		 
	}

	}
	

	
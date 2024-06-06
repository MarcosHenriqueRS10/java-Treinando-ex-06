package EWF;

import java.util.Scanner;

public class EF {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		int escolha = 4;
		double valor;
		boolean nRodar;
		double cotacao;
		boolean rodar = true;

		while (rodar == true) { 
				

			System.out.println("Escolha qual voce quer converter: ");
			System.out.println("1 para - Pesos");
			System.out.println("2 para - Dolár");
			System.out.println("3 para - Euro");
			System.out.println("4 para parar côdigo");
			escolha = e.nextInt();
			
			if(escolha == 4) {
				System.exit(0);			
			}
			System.out.println("=====================================================");
			
			System.out.println("Digite o valor que quer converter: ");
			valor = e.nextDouble();

		switch (escolha) {
		case 1:
			System.out.println("Você quer converter em pesos:" + escolha);
			cotacao = (valor * 0.30);
			System.out.println("vai ser convertido de " + valor + " Para " + (cotacao));
			System.out.println("============================================");
			break;
		case 2:
			System.out.println("Você quer converter em Dolár: " + escolha);
			cotacao = (valor * 5.29);
			System.out.println("vai ser convertido de " + valor + " Para " + (cotacao));
			System.out.println("============================================");
			break;
		case 3:
			System.out.println("Você quer converter em Euro: " + escolha);
			cotacao = (valor * 5.75);
			System.out.println("vai ser convertido de " + valor + " Para " + (cotacao));
			System.out.println("============================================");
			break;
		}
		}
		
		

		// OU

		// if(escolha == 1) {
		// cotacao = (valor * 0.30);
		// System.out.println("vai ser convertido de " + valor + " Para " + (cotacao));
		// }else if(escolha == 2) {
		// cotacao = (valor * 5.29);
		// System.out.println("vai ser convertido de " + valor + " Para " + (cotacao));
		// }else if (escolha == 3) {
		// cotacao = (valor * 5.75);
		// System.out.println("vai ser convertido de " + valor + " Para " + (cotacao));
		// }
	}

}

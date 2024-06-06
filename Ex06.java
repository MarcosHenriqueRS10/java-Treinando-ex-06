package EWF;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

		int vendaMedia;
		double precoAtual;
		double aumento;
		
		System.out.println("Digite a venda média mensal: ");
		vendaMedia = e.nextInt();
		
		System.out.println("Digite o preço atual do produto: ");
		precoAtual = e.nextDouble();
		
		if(vendaMedia < 500 || precoAtual < 30) {
			aumento = (precoAtual * 0.10);
			System.out.println("Novo Preço vai ser: " + (precoAtual + aumento) );
		}else if(vendaMedia >= 500 && vendaMedia < 1200) {
			aumento = (precoAtual * 0.15);
			System.out.println("Novo Preço vai ser: " + (precoAtual + aumento) );
		}else if(vendaMedia >= 1200) {
			aumento = (precoAtual * 0.20);
			System.out.println("Novo Preço vai ser: " + (precoAtual - aumento) );
		}

	}

}

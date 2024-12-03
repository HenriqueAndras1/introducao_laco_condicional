package introducaoLacoCondicional;

import java.util.Scanner;

public class LacoSwitchLanchonete {

	public static void main(String[] args) {

		int uni;
        int cod;
        float total;
		
		Scanner leia = new Scanner(System.in);

		System.out.println(" Menu Lanchonete - Escolha o seu pedido");
		System.out.println("\n Código do Produto   -    Produto      - Preço Unitário");
		System.out.println("          1      	 - Cachorro-Quente - R$15.00");
		System.out.println("          2      	 - X-Salada        - R$15.00");
		System.out.println("          3      	 - X-Bacon         - R$18.00");
		System.out.println("          4      	 - Bauru           - R$12.00");
		System.out.println("          5      	 - Refrigerante    - R$8.00");
		System.out.println("          6      	 - Suco de Laranja - R$13.00");
		System.out.println("\n Digite o código do Produto!");
		cod = leia.nextInt();

		switch (cod) {
		case 1:
			System.out.printf("Quantos Cachorros-Quentes você vai querer?");
			cod = 15;
			break;
			
		case 2:
			System.out.printf("Quantos X-Saladas você vai querer?");
			cod = 15;
			break;
			
		case 3:
			System.out.printf("Quantos X-Bacons você vai querer?");
			cod = 18;
			break;
			
		case 4:
			System.out.printf("Quantos Baurus você vai querer?");
			cod = 12;
			break;

		case 5:
			System.out.printf("Quantos Refrigerantes você vai querer?");
			cod = 8;
			break;

		case 6:
			System.out.printf("Quantos Sucos de Laranja você vai querer?");
			cod = 13;
			break;
			
		default:
			System.out.println("Opção inválida!");

		}
		
		System.out.printf("");
		uni = leia.nextInt();
		
		total = uni * cod;
		
		System.out.printf("\nTotal a pagar de %.2f.", total );
		
		leia.close();

	}

}

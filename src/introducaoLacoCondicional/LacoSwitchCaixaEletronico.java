package introducaoLacoCondicional;

import java.util.Scanner;

public class LacoSwitchCaixaEletronico {

	public static void main(String[] args) {

		float saldo = 1000;
		float deposito = 0;
		float saque;
		
		int opcao;
		Scanner leia = new Scanner(System.in);

		System.out.println("Codigo de Operação caixa eletronico");
		System.out.println("Digite 1 para ver o Saldo");
		System.out.println("Digite 2 para fazer um saque");
		System.out.println("Digite 3 para fazer um um deposito");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.printf("Seu saldo atual é %.2f.", saldo);
			break;
		case 2:
			System.out.println("Digite o valor que quer sacar ! ");
			saque = leia.nextFloat();
			if (saque > 0 && saque < saldo){
				saldo = saldo -= saque; // Processamento
                System.out.printf("Seu saldo é de %.2f.", saldo);
            } else if (saque > saldo) {
                System.out.println("Saldo infuficiente para esse valor !");
            }
			break;
		case 3:
			System.out.println("Digite o valor que quer depositar ! ");
			deposito = leia.nextFloat();
			if (deposito > 0){			
                System.out.printf("Seu saldo é de %.2f.", saldo + deposito);
            } else{
                System.out.println("Valor minimo de deposito 1,00R$ !");
            }
			break;
			
		default:
			System.out.println("Opção inválida!");
			
		
		}
		leia.close();
	
	}

}

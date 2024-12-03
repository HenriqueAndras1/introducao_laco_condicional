package introducaoLacoCondicional;

import java.util.Scanner;

public class LacoCondicionalIf {

	public static void main(String[] args) {
		
		// Variaveis 
		int valorA;
		int valorB;
		int valorC;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número para A: ");
		valorA = leia.nextInt();
		
		System.out.println("Digite um número para B: ");
		valorB = leia.nextInt();
		
		System.out.println("Digite um número para C: ");
		valorC = leia.nextInt();
		
		//Processamento
		if(valorA + valorB == valorC) {
			System.out.println("A soma do valor A + B é igual C !");
		}if(valorA + valorB > valorC) {
			System.out.println("A soma do valor A + B é maior do que C !");
		}if(valorA + valorB < valorC) {
			System.out.println("A soma do valor A + B é menor do que C !");
		}
		
	
	}

}

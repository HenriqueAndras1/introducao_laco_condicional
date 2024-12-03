package introducaoLacoCondicional;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {

        // Variáveis
        int numeros;

        Scanner leia = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um número: ");
        numeros = leia.nextInt();

        // Processamento
        if (numeros > 0) { 
            if (numeros % 2 == 0) {
                System.out.println("O " + numeros + " é par positivo!");
            } else {
                System.out.println("O " + numeros + " é ímpar positivo!");
            }
        } else if (numeros < 0) { 
            if (numeros % 2 == 0) {
                System.out.println("O " + numeros + " é par negativo!");
            } else {
                System.out.println("O " + numeros + " é ímpar negativo!");
            }
        } 

        leia.close();
    }
}

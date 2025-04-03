package soma;

import java.util.Scanner;

public class SomaPositivos {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int num;
        while (true) {
            System.out.println("Digite um número inteiro positivo (negativo se quiser parar): ");
            num = Integer.parseInt(teclado.nextLine());
            if (num < 0) {
                break;
            }
            soma += num;
        }
        System.out.println("A soma de todos os números positivos digitados é: " + soma);
        teclado.close();
    }
}

package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double n1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite o segundo valor: ");
        double n2 = Double.parseDouble(teclado.nextLine());

        System.out.printf("Soma: %.2f + %.2f = %.2f", n1, n2, n1 + n2);
        System.out.println();
        System.out.printf("Subtração: %.2f - %.2f = %.2f", n1, n2, n1 - n2);
        System.out.println();
        System.out.printf("Multiplicação: %.2f X %.2f = %.2f", n1, n2, n1 * n2);
        System.out.println();
        if (n2 == 0) {
            System.out.printf("Não foi possível fazer a divisão %.2f / %.2f", n1, n2);
        } else {
            System.out.printf("Divisão: %.2f / %.2f = %.2f", n1, n2, n1 / n2);
            System.out.println();
            System.out.printf("Resto da divisão: %.2f %% %.2f = %.2f", n1, n2, n1 % n2);
        }
        teclado.close();
    }
}

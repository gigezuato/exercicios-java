package tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d X %d = %d", num, i, i*num);
            System.out.println();
        }
        teclado.close();
    }
}
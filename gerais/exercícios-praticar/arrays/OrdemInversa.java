package arrays;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int [5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %d° numero: ", i+1);
            numeros[i] = Integer.parseInt(teclado.nextLine());
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        teclado.close();
    }
}

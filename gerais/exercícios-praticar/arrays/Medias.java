package arrays;

import java.util.Scanner;

public class Medias {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double [] notas = new double [4];
        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a %d° nota: ", i+1);
            notas[i] = Double.parseDouble(teclado.nextLine());
        }
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("A média é %.2f e o status é: ", media);
        if (media >= 7) {
            System.out.print("Aprovado!");
        } else if (media >= 5) {
            System.out.print("Recuperação!");
        } else {
            System.out.print("Reprovado!");
        }

        teclado.close();
    }
}

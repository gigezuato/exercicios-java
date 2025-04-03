package idades;

import java.util.Scanner;
public class FaixaEtaria {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(teclado.nextLine());
        
        if (idade <= 12) {
            System.out.println("Sua faixa etária é: Criança!");
        } else if (idade <= 17) {
            System.out.println("Sua faixa etária é: Adolescente!");
        } else if (idade <= 59) {
            System.out.println("Sua faixa etária é: Adulto!");
        } else {
            System.out.println("Sua faixa etária é: Idoso!");
        }
        teclado.close();
    }
}

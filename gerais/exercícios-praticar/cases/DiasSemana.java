package cases;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro de 1 a 7: ");
        int num = Integer.parseInt(teclado.nextLine());
        String dia;

        switch(num) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia não identificado";
                break;
        }

        System.out.printf("Esse número corresponde ao dia da semana: %s", dia);
        teclado.close();
    }
}

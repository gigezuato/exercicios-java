
import java.util.Scanner;

public class NumeroEntre {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um número entre 1 e 100: ");
            num = Integer.parseInt(teclado.nextLine());
        } while (num < 1 || num > 100);
        System.out.println("Você digitou: " + num);
        teclado.close();
    }
}
import java.util.Scanner;

public class Comparar {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite o segundo número: ");
        int n2 = Integer.parseInt(teclado.nextLine());

        if (n1 > n2) {
            System.out.printf("O número %d é maior que o %d.", n1, n2);
        } else if (n2 > n1) {
            System.out.printf("O número %d é maior que o %d.", n2, n1);
        } else {
            System.out.printf("Os números %d e %d são iguais.", n1, n2);
        }
        teclado.close();
    }
}

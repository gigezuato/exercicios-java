import java.util.Scanner;

public class Emprestimo {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = Integer.parseInt(teclado.nextLine());
        System.out.println("Renda: ");
        double renda = Double.parseDouble(teclado.nextLine());

        if (idade >= 18 && idade <= 65 && renda >= 2000) {
            System.out.println("Empréstimo Aprovado!");
        } else {
            System.out.println("Empréstimo Negado!");
        }
        teclado.close();
    }
}

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = Integer.parseInt(teclado.nextLine());
        int rest;
        int qtdeDiv = 0;
        for(int i = 1; i <= num; i++) {
            rest = num % i;
            if (rest == 0) {
                qtdeDiv += 1;
            }
        }
        if (qtdeDiv > 2) {
            System.out.println("Não é um número primo!");
        } else {
            System.out.println("É um número primo!");
        }
        
        teclado.close();
    }
}

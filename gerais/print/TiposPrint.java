package print;

public class TiposPrint {
    public static void main(String[] args) {
        int ano = 2025;
        String mes = "fevereiro";
        System.out.print("O print imprime sem adicionar uma nova linha.");
        System.out.println(" O println imprime e automaticamente adiciona uma nova linha.");
        System.out.println("Olha só, esse texto está embaixo!");
        System.out.printf("O printf imprime com formatação. Exemplo: Estamos em %s de %d", mes, ano);
    }
}

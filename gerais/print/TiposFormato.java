package print;

public class TiposFormato {
    public static void main(String[] args) {
        System.out.printf("Número inteiro decimal: %d usa-se %%d. Pode ser => int, short, long, byte.%n", 102);
        System.out.printf("Número de ponto flutuante: %f ou %.2f usa-se %%f para números decimais e %%.2f para que tenha somente 2 casas decimais.%n", 5.286, 2.42);
        System.out.println("O número de casas decimais pode ser alterado, mudando o num em %.numf");
        System.out.printf("Caractere: %c ou %C usa-se %%c para caracteres e %%C para colocar o caracter em maiúsculo.%n", 'g', 'g');
        System.out.printf("Strings: %s ou %S usa-se %%s para strings e %%S para colocar todas as letras em maiúsculo.%n", "Olá, mundo!", "Olá, mundo!");
        System.out.printf("Valores booleanos: %b usa-se %%b.%n", true);
        System.out.printf("Exponencial ou notação científica: %e ou %E usa-se %%e para minúsculo e %%E para maiúsculo.%n", 12.5289, 5.48526);
        System.out.printf("Números Octais: %o (10) usa-se %%o.%n", 10);
        System.out.printf("Números Hexadecimais: %x usa-se %%x.%n", 245);
    }
}
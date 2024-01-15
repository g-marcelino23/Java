package ListaUm;

public class CalculoDiferenca {
    public static void main(String[] args) {
        int n = 10; // Número de naturais
        int somaDosQuadrados = 0;
        int quadradoDaSoma = 0;

        // Calcula a soma dos quadrados dos primeiros n números naturais
        for (int i = 1; i <= n; i++) {
            somaDosQuadrados += i * i;
        }


        // Calcula o quadrado da soma dos primeiros n números naturais
        int soma = (n * (n + 1)) / 2;
        quadradoDaSoma = soma * soma;

        // Calcula a diferença entre a soma dos quadrados e o quadrado da soma
        int diferenca = quadradoDaSoma - somaDosQuadrados;

        System.out.println("A soma dos quadrados dos primeiros " + n + " números naturais é: " + somaDosQuadrados);
        System.out.println("O quadrado da soma dos primeiros " + n + " números naturais é: " + quadradoDaSoma);
        System.out.println("A diferença entre a soma dos quadrados e o quadrado da soma é: " + diferenca);
    }
}

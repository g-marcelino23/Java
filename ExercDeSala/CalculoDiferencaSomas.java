package ExercDeSala;

public class CalculoDiferencaSomas {
    public static void main(String[] args) {
        int n = 10;
        int somaDosQuadrados = 0;
        int soma = 0;

        // Calcula a soma dos quadrados dos primeiros 10 números naturais
        for (int i = 1; i <= n; i++) {
            somaDosQuadrados += i * i;
        }

        // Calcula a soma dos primeiros 10 números naturais
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        // Calcula o quadrado da soma
        int quadradoDaSoma = soma * soma;

        // Calcula a diferença entre a soma dos quadrados e o quadrado da soma
        int diferenca = quadradoDaSoma - somaDosQuadrados;

        System.out.println("A soma dos quadrados dos primeiros " + n + " números naturais é: " + somaDosQuadrados);
        System.out.println("O quadrado da soma dos primeiros " + n + " números naturais é: " + quadradoDaSoma);
        System.out.println("A diferença entre a soma dos quadrados e o quadrado da soma é: " + diferenca);
    }
}

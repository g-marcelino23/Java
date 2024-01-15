package ListaUm;

import java.util.Scanner;

public class CalculadoraDeQuadradoERaiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Quadrado e Raiz Quadrada");
        System.out.print("Digite um número: ");

        // Lê o número fornecido pelo usuário
        double numero = scanner.nextDouble();

        if (numero > 0) {
            // Calcula o quadrado do número
            double quadrado = numero * numero;

            // Calcula a raiz quadrada do número
            double raizQuadrada = Math.sqrt(numero);

            // Exibe os resultados
            System.out.println("O quadrado do número é: " + quadrado);
            System.out.println("A raiz quadrada do número é: " + raizQuadrada);
        } else {
            System.out.println("O número não é positivo, não é possível calcular o quadrado e a raiz quadrada.");
        }

        scanner.close();
    }
}

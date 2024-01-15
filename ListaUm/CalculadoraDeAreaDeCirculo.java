package ListaUm;

import java.util.Scanner;

public class CalculadoraDeAreaDeCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Área de Círculo");
        System.out.print("Por favor, digite o raio do círculo: ");

        // Lê o raio do círculo fornecido pelo usuário
        double raio = scanner.nextDouble();

        // Calcula a área do círculo
        double area = Math.PI * raio * raio;

        // Exibe o resultado
        System.out.println("A área do círculo com raio " + raio + " é: " + area);

        scanner.close();
    }
}

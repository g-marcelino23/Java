package ExercDeSala;

import java.util.Scanner;

public class ConversaoAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();

        // Constante para pi
        double pi = 3.14;

        // Conversão de graus para radianos
        double radianos = graus * (pi / 180.0);

        System.out.println("O ângulo em radianos é: " + radianos);

        scanner.close();
    }
}

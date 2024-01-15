package ExercDeSala;

import java.util.Scanner;

public class CalculoNumeroHarmonico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro e positivo n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O valor de n deve ser um número inteiro e positivo.");
        } else {
            double numeroHarmonico = 0.0;

            for (int i = 1; i <= n; i++) {
                numeroHarmonico += 1.0 / i;
            }

            System.out.println("O número harmônico H(" + n + ") é: " + numeroHarmonico);
        }

        scanner.close();
    }
}

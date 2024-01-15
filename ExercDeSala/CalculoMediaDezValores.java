package ExercDeSala;

import java.util.Scanner;

public class CalculoMediaDezValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalValores = 10;
        double soma = 0;

        for (int i = 1; i <= totalValores; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / totalValores;
        System.out.println("A média dos 10 valores digitados é: " + media);

        scanner.close();
    }
}

package ExercDeSala;

import java.util.Scanner;

public class CalculoAumentoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o valor do salário do funcionário
        System.out.print("Digite o valor do salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Solicitar a porcentagem de aumento
        System.out.print("Digite a porcentagem de aumento: ");
        double percentualAumento = scanner.nextDouble();

        // Calcular o aumento em valor
        double aumento = salario * (percentualAumento / 100.0);

        // Calcular o novo salário com aumento
        double novoSalario = salario + aumento;

        // Exibir o valor do aumento e o novo salário com duas casas decimais
        System.out.printf("O valor do aumento é: %.2f%n", aumento);
        System.out.printf("O novo salário com aumento é: %.2f%n", novoSalario);

        scanner.close();
    }
}


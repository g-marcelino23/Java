package ListaUm;

import java.util.Scanner;

public class VerificadorDeEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de Empréstimo");
        System.out.print("Informe o salário do trabalhador: ");
        double salario = scanner.nextDouble();

        System.out.print("Informe o valor da prestação do empréstimo: ");
        double prestacao = scanner.nextDouble();

        // Calcula 20% do salário
        double limitePrestacao = 0.20 * salario;

        if (prestacao > limitePrestacao) {
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }

        scanner.close();
    }
}


package ListaUm;

import java.util.Scanner;

public class CalculadoraRaizesEquacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Raízes de Equação de 2º Grau");
        System.out.print("Informe o coeficiente 'a' (deve ser diferente de zero): ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            System.out.print("Informe o coeficiente 'b': ");
            double b = scanner.nextDouble();

            System.out.print("Informe o coeficiente 'c': ");
            double c = scanner.nextDouble();

            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Não existe raiz real.");
            } else if (delta == 0) {
                double raizUnica = -b / (2 * a);
                System.out.println("Raiz Única: " + raizUnica);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raiz 1: " + raiz1);
                System.out.println("Raiz 2: " + raiz2);
            }
        }

        scanner.close();
    }
}


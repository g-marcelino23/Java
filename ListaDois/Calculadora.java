import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Calculadora");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 5) {
                System.out.println("Encerrando a calculadora. Adeus!");
                break;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double valor2 = scanner.nextDouble();

            double resultado = 0;

            switch (opcao) {
                case 1:
                    resultado = adicao(valor1, valor2);
                    break;
                case 2:
                    resultado = subtracao(valor1, valor2);
                    break;
                case 3:
                    resultado = multiplicacao(valor1, valor2);
                    break;
                case 4:
                    resultado = divisao(valor1, valor2);
                    break;
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }

    public static double adicao(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return a / b;
    }
}

package ListaDois;

import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu gênero (h para homem, m para mulher): ");
        char genero = scanner.next().charAt(0);

        double imc = calcularIMC(peso, altura);
        System.out.println("Seu IMC é: " + imc);

        double pesoIdeal = calcularPesoIdeal(peso, altura, genero);
        System.out.println("Seu peso ideal é: " + pesoIdeal);

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static double calcularPesoIdeal(double peso, double altura, char genero) {
        double pesoIdeal;

        if (genero == 'h' || genero == 'H') {
            pesoIdeal = 22.0 * altura * altura;
        } else if (genero == 'm' || genero == 'M') {
            pesoIdeal = 21.0 * altura * altura;
        } else {
            System.out.println("Gênero inválido. Use 'h' para homem ou 'm' para mulher.");
            return 0;
        }

        return pesoIdeal;
    }
}

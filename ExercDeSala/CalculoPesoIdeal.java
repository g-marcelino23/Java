package ExercDeSala;

import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para um homem com essa altura é: " + pesoIdeal + " kg");
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal para uma mulher com essa altura é: " + pesoIdeal + " kg");
        } else {
            System.out.println("Sexo não reconhecido. Use M para masculino ou F para feminino.");
        }

        scanner.close();
    }
}

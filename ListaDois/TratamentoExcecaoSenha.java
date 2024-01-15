package ListaDois;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecaoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua senha (valor numérico): ");
            double senha = scanner.nextDouble();
            System.out.println("Senha válida: " + senha);
        } catch (InputMismatchException e) {
            System.out.println("Senha inválida. Por favor, digite um valor numérico.");
        } finally {
            scanner.close(); // Feche o scanner para liberar recursos
        }
    }
}

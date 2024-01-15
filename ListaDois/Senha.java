package ListaDois;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha = 0;

        try {
            System.out.print("Digite a senha (valor numérico): ");
            senha = scanner.nextInt();
            System.out.println("Senha correta: " + senha);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir um valor numérico.");
        } finally {
            scanner.close();
        }
    }
}

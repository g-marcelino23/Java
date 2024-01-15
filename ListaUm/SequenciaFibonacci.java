package ListaUm;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos (N) da sequência de Fibonacci que você deseja gerar: ");
        int n = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");

        if (n >= 1) {
            System.out.print(primeiroTermo);
        }
        if (n >= 2) {
            System.out.print(", " + segundoTermo);
        }

        for (int i = 3; i <= n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        System.out.println();

        scanner.close();
    }
}


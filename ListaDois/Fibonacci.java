package ListaDois;

import java.util.Scanner;

public class Fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número de termos de Fibonacci que deseja calcular: ");
            int n = scanner.nextInt();

            System.out.println("Sequência de Fibonacci com " + n + " termos:");
            for (int i = 0; i < n; i++) {
                System.out.print(calcularFibonacci(i) + " ");
            }

            scanner.close();
        }

        public static int calcularFibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
            }
        }
    }

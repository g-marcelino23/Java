package ListaDois;

import java.util.Scanner;

public class MatrizSomatorioDiagonal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número de linhas da matriz: ");
            int linhas = scanner.nextInt();

            System.out.print("Digite o número de colunas da matriz: ");
            int colunas = scanner.nextInt();

            if (linhas != colunas) {
                System.out.println("A matriz não é quadrada, não é possível calcular o somatório.");
                scanner.close();
                return;
            }

            int[][] matriz = new int[linhas][colunas];

            preencherMatriz(matriz, scanner);

            int somatorio = calcularSomatorioDiagonal(matriz);
            System.out.println("Somatório dos elementos acima da diagonal principal: " + somatorio);

            scanner.close();
        }

        public static void preencherMatriz(int[][] matriz, Scanner scanner) {
            System.out.println("Preencha a matriz:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }

        public static int calcularSomatorioDiagonal(int[][] matriz) {
            int somatorio = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = i + 1; j < matriz[i].length; j++) {
                    somatorio += matriz[i][j];
                }
            }
            return somatorio;
        }
    }

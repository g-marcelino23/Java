package ListaUm;

import java.util.Scanner;

public class DistribuicaoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Distribuição de Notas em Caixa Eletrônico");
        System.out.print("Digite o valor da quantia solicitada: ");
        int quantia = scanner.nextInt();

        int nota50 = quantia / 50;
        quantia %= 50;

        int nota10 = quantia / 10;
        quantia %= 10;

        int nota5 = quantia / 5;
        quantia %= 5;

        int nota1 = quantia;

        System.out.println("Nota50 = " + nota50);
        System.out.println("Nota10 = " + nota10);
        System.out.println("Nota5 = " + nota5);
        System.out.println("Nota1 = " + nota1);

        scanner.close();
    }
}

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da quantia solicitada: ");
        int valor = scanner.nextInt();

        int notas50 = valor / 50;
        valor = valor % 50;

        int notas10 = valor / 10;
        valor = valor % 10;

        int notas5 = valor / 5;
        int notas1 = valor % 5;

        System.out.println("Distribuição das notas:");
        System.out.println("Nota50 = " + notas50);
        System.out.println("Nota10 = " + notas10);
        System.out.println("Nota5 = " + notas5);
        System.out.println("Nota1 = " + notas1);
    }
}


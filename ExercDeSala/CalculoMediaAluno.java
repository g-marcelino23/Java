package ExercDeSala;

import java.util.Scanner;

public class CalculoMediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;
        String situacao;

        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media > 4.0) {
            situacao = "Final";
            System.out.print("Digite a nota da prova final: ");
            double notaFinal = scanner.nextDouble();
            media = (media + notaFinal) / 2.0;
            if (media >= 5.0) {
                situacao = "Aprovado na Final";
            } else {
                situacao = "Reprovado na Final";
            }
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}

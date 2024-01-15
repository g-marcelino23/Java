package ExercDeSala;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que você ganha por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas por mês: ");
        double horasTrabalhadasPorMes = scanner.nextDouble();

        double salarioBruto = valorPorHora * horasTrabalhadasPorMes;
        double impostoRenda = 0.11 * salarioBruto;
        double inss = 0.08 * salarioBruto;
        double sindicato = 0.05 * salarioBruto;
        double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;

        System.out.println("+ Salário Bruto: R$" + salarioBruto);
        System.out.println("- IR (11%): R$" + impostoRenda);
        System.out.println("- INSS (8%): R$" + inss);
        System.out.println("- Sindicato (5%): R$" + sindicato);
        System.out.println("= Salário Líquido: R$" + salarioLiquido);

        scanner.close();
    }
}

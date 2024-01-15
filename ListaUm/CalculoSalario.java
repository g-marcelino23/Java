package ListaUm;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Informe o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        scanner.close();

        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - ir - inss - sindicato;

        System.out.println("+ Salário Bruto: R$" + salarioBruto);
        System.out.println("- IR (11%): R$" + ir);
        System.out.println("- INSS (8%): R$" + inss);
        System.out.println("- Sindicato (5%): R$" + sindicato);
        System.out.println("= Salário Líquido: R$" + salarioLiquido);
    }
}


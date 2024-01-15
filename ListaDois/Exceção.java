package ListaDois;

public class Exceção {
    public static void PrimeiroMetodo() {
        System.out.println("Inicio da execução do primeiro método!");
        try {
            SegundoMetodo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção ArrayIndexOutOfBoundsException capturada: " + e.getMessage());
        }
        System.out.println("Fim da execução do primeiro método!");
    }

    public static void SegundoMetodo() {
        System.out.println("Inicio da execução do segundo método!");
        double v[] = new double[5];
        for (int i = 0; i <= 10; i++) {
            try {
                v[i] = i;
                System.out.println(i);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exceção ArrayIndexOutOfBoundsException capturada: " + e.getMessage());
                break; // Saia do loop quando ocorrer a exceção
            }
        }
        System.out.println("Fim da execução do segundo método!");
    }

    public static void main(String[] args) {
        System.out.println("Inicio da main");
        PrimeiroMetodo();
        System.out.println("Fim da main");
    }
}

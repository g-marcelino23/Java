package ListaDois;

public class ExceçãoDois {
    public static double iterativeDivide(double... args) {
        double total = 1;
        for (double i : args) {
            if (i == 0) {
                System.out.println("Erro: Divisão por zero não é permitida.");
                return Double.NaN; // ou qualquer outro valor que faça sentido no contexto
            }
            total /= i;
        }
        return total;
    }

    public static String toLowerCase(String phrase) {
        if (phrase == null) {
            System.out.println("Erro: A frase é nula. Não é possível converter para minúsculas.");
            return ""; // ou qualquer ação apropriada
        }

        String newPhrase = phrase.toLowerCase();
        return newPhrase;
    }

    public static void main(String[] args) {
        System.out.println(iterativeDivide(1, 2.1, 3.2, 4.1, 0));
        System.out.println(toLowerCase("OLA A TODOS"));
    }
}

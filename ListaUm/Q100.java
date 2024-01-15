package ListaUm;

import java . util . Scanner ;
public class Q100 {
    public static void main ( String [] args ) {
        Scanner scan = new Scanner ( System . in );
        int n = 1;
        float diff , somaQuad = 0, quadSoma = 0;
        while (n <= 10) {
            quadSoma = quadSoma + n *n;
            somaQuad = somaQuad + n ;
            n ++;
        }
        somaQuad = somaQuad * somaQuad ;
        System . out . println (" Valor do Quadrado da Soma : " + somaQuad ) ;
        System . out . println (" Valor do Soma dos Quadrados : " + quadSoma );
        diff = somaQuad - quadSoma ;
        System . out . println (" Diferente : " + diff );
        scan . close () ;
    }
}

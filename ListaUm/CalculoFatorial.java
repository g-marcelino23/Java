import java.util.Scanner ;
public class CalculoFatorial {
    public static void main ( String args []) {
        Scanner scan = new Scanner (System.in);
        int fat = 1 , val ;
        System . out . print (" Digite um valor : ") ;
        val = scan . nextInt () ;
        if ( val < 0) {
            System . out . println (" N o existe fatorial de negativos ");
        } else if ( val == 0) {
            System . out . println ("1");
        } else {
            for (int i = 1; i <= val ; i ++) {
                fat = fat *i;
            }
            System . out . println (" Valor do fatorial : " + fat );
        }
    }
}
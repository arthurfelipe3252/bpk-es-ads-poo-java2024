public class FunçãoRecursivaFAT {

    public static int fatorial(int n) {

       if(n == 1) {
           return 1;
       } else {
           return n * fatorial(n-1);
       }
    }
}

package funcoes;

public class Questao07 {

    
    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}
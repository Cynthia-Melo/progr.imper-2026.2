import java.util.Scanner;

public class Questao03 {

    public static double calcularMedia(double[] salarios, int n) {
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + salarios[i];
        }
        return soma / n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        double[] salarios = new double[n];

        for (int i = 0; i < n; i++) {
            salarios[i] = s.nextDouble();
        }

        double media = calcularMedia(salarios, n);
        System.out.println("Média salarial: " + media);
    }
}

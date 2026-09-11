import java.util.Scanner;

public class Questao02 {

    public static double maiorAtura(double[] altura) {
        double maior = altura[0];
        for (int i = 1; i < 10; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
        }
        return maior;
    }

    public static double menorAltura(double[] altura) {
        double menor = altura[0];
        for (int i = 0; i < 10; i++) {
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }
        return menor;
    }

    public static double mediaHomens(int[] sexo, double[] altura) {
        double soma = 0;
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            if (sexo[i] == 2) {
                soma = soma + altura[i];
                cont++;
            }
        }
        if (cont == 0) {
            return 0;
        }
        return soma / cont;
    }

    public static int qtdeMulheres(int[] sexo) {
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            if (sexo[i] == 1) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] sexo = new int[10];
        double[] altura = new double[10];

        for (int i = 0; i < 10; i++) {
            sexo[i] = s.nextInt();
            altura[i] = s.nextDouble();
        }

        System.out.println("Maior altura: " + maiorAtura(altura) + " m");
        System.out.println("Menor altura: " + menorAltura(altura) + " m");
        System.out.println("Média de altura dos homens: " + mediaHomens(sexo, altura) + " m");
        System.out.println("Número de mulheres: " + qtdeMulheres(sexo));
    }
}
import java.util.Scanner;

public class Questao02vt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] v = new int[6];

        System.out.println("Digite 6 números inteiros");
        for (int i = 0; i < 6; i++) {
            v[i] = s.nextInt();
        }

        System.out.println("\nValores lidos: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(v[i]);
        }
    }
}
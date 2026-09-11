public class Questao01vt {
    public static void main(String[] args) {
        int[] A = {1, 0, 5, -2, -5, 7};

        int soma = A[0] + A[1] + A[5];

        System.out.println("Soma: " + soma);
        A[4] = 100;

        for (int i=0; i<=6; i++){
            System.out.println(A[i]);
        }

    }
}

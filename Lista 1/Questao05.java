import java.util.Scanner;

public class Questao05 {
    public static double calcularVolume(double raio, double altura) {
        double pi = 3.14159;
        return pi * raio * raio * altura;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = s.nextDouble();

        System.out.print("Altura: ");
        double altura = s.nextDouble();

        double volume = calcularVolume(raio, altura);

        System.out.println("Volume da lata de óleo: " + volume + " m³");
    }
}

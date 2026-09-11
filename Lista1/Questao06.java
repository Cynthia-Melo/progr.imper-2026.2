import java.util.Scanner;

public class Questao06 {
    public static double calcularPotenciaHp(double massa, double altura, double tempo) {
        double g = 9.81;
        double potenciaWatts = (massa * g * altura) / tempo;
        double hp = potenciaWatts / 745.6999;
        return hp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Massa: ");
        double massa = s.nextDouble();

        System.out.print("Altura: ");
        double altura = s.nextDouble();

        System.out.print("Tempo: ");
        double tempo = s.nextDouble();

        double resultado = calcularPotenciaHp(massa, altura, tempo);

        System.out.println("Potência necessária: " + resultado + " hp");
    }
}
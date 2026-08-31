import java.util.Scanner;

public class Questao04 {

    // Função para calcular a quantidade sem usar Math
    public static int calcularAzulejos(double altParede, double largParede, double altAzulejo, double largAzulejo) {
        double areaParede = altParede * largParede;
        double areaAzulejo = altAzulejo * largAzulejo;
        double total = areaParede / areaAzulejo;

        int totalInteiro = (int) total;

        // Se tem parte fracionária (ex: 39.62 > 39), precisa de mais 1 azulejo
        if (total > totalInteiro) {
            return totalInteiro + 1;
        } else {
            return totalInteiro;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Altura da parede: ");
        double altParede = s.nextDouble();

        System.out.print("Largura da parede: ");
        double largParede = s.nextDouble();

        System.out.print("Altura do azulejo: ");
        double altAzulejo = s.nextDouble();

        System.out.print("Largura do azulejo: ");
        double largAzulejo = s.nextDouble();

        int quantidade = calcularAzulejos(altParede, largParede, altAzulejo, largAzulejo);

        System.out.println("Quantidade de azulejos necessários: " + quantidade);
    }
}
package funcoes;

import java.util.Scanner;

public class Questao01 {

    public static double converte(double c){
        return c * 1.8 + 32;

    }

    public static double converte1( double c){
        return c + 273.15;

    }

    public static double converte2( double c){
        return c * 0.8;

    }

    public static double converte3 ( double c) {
        return c * 1.8 + 491.67;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double celsius = s.nextDouble();

        System.out.println("Fahrenheit: " + converte(celsius));
        System.out.println("Kelvin: " + converte1(celsius));
        System.out.println("Réaumur: " + converte2(celsius));
        System.out.println("Rankine: " + converte3(celsius));

    }
}
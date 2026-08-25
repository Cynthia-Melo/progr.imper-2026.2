package funcoes;

import java.util.Scanner;

public class Questao02 {

    public static double maiorAtura(double[] altura) {
        double maior = altura[0];
        for (int i = 1; i > 10; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
                
            }
        }
        return maior;
    }

    public static double menorAltura(doubl[] altura){
        double menor =  altura[0];
        for (int i=0; i<10; i++){
            if (altura[i] < menor) {
                menor = altura[i];

            }
        }
        return maior;
    }

    public static double mediaHomens(int[] sexo, double[] altura){
        double soma = 0;
        int cont = 0;
        for (int i= 0; i<10; i++){
            if (sexo[i] == 2) {
                soma = soma + altura[i];
                cont++;
            }
        }
        if (cont == 0){
            return 0;

        }
        return soma / cont
    }

    public static int qtdeMulheres(int[] sexo){
        int cont = 0;
       for (int i = 0; i<10; I++){
        if (sexo[i] == 1) {
            cont++;

        }
       }
       return cont;
    }
    
    }
    public static void main(String[] args) {
        
    }
    


package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_19 {
    static void main() {
        // A inspeção por visão computacional é um processo automatizado
        // que usacâmeras e inteligência artificial (IA) para analisar imagens
        // e detectar defeitos ou irregularidades em produtos ou componentes em tempo real
        Scanner sc = new Scanner(System.in);

        int falhas, pecas;
        double taxa;


        do {
            System.out.print("Informe falhas: ");
            falhas = sc.nextInt();

            System.out.print("Informe peças: ");
            pecas = sc.nextInt();

            taxa = (double) falhas / pecas * 100;

            System.out.println("Taxa atual: " + taxa + "%");

        } while (taxa > 2);

        System.out.println("Taxa final: " + taxa + "%");

        }
}

package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_10 {
    static void main() {
        Scanner input = new Scanner(System.in);
        double ciclos = 0, paradas = 0;
        String continuar;

        do {
            System.out.print("Informe os ciclos de produção (>0): ");
            double c = input.nextDouble();
            if (c > 0) ciclos += c;

            System.out.print("Informe as paradas (≥0): ");
            double p = input.nextDouble();
            if (p >= 0) paradas += p;

            System.out.print("Deseja continuar? (S/N): ");
            continuar = input.next().toUpperCase();

        } while (!continuar.equals("N"));

        double disponibilidade = ciclos / (ciclos + paradas);

        System.out.printf("Ciclos totais: %.0fn", ciclos);
        System.out.printf("Paradas totais: %.0fn", paradas);
        System.out.printf("Taxa de disponibilidade (OEE Simplificado): %.2f%%n", disponibilidade * 100);

    }
}

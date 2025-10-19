package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_18 {
    static void main() {
        // Takt time = ritmo ideal de produção (tempo máximo para cada item).
        Scanner sc = new Scanner(System.in);

        double takt, tempo, soma = 0, media;
        int estacoes = 0;

        System.out.print("Informe o takt time: ");
        takt = sc.nextDouble();


        do {
            System.out.print("Digite o tempo da estação: ");
            tempo = sc.nextDouble();

            estacoes++;
            soma += tempo;
            media = soma / estacoes;

        } while (media > takt);

        System.out.println("Média: " + media);
        System.out.println("Estações: " + estacoes);
    }
}

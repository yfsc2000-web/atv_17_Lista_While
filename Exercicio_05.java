package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_05 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int pecas = 0;

        do {
            System.out.println("Informe o peso de cada peça do lote:");
            int peso = input.nextInt();

            total += peso;
            pecas++;
        } while (total< 500);
        System.out.println(" O peso total é:" +total + ", e chegou no limite.");

    }
}

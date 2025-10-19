package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_02 {
    static void main() {
        // CNC = Controle Numérico Computadorizado
        // Sistema que controla máquinas industriais automaticamente por computador.

        Scanner input = new Scanner(System.in);
        int total = 0;
        int ciclos = 0;

        do {
            System.out.print("Informe a quantidade de peças produzidas no ciclo: ");
            int pecas = input.nextInt();

            total += pecas;
            ciclos++;

        } while (total < 120);

        System.out.println("Ciclos: " + ciclos + " | Total: " + total);
        input.close();
    }
}





package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_08 {
    static void main() {
        // AGV = Autonomous Guided Vehicle (Veículo Guiado Automaticamente)
        // Usado em fábricas para transportar materiais sem motorista.

        Scanner input = new Scanner(System.in);
        int caixas, total = 0, viagens = 0;

        do {
            System.out.print("Caixas entregues nesta viagem: ");
            caixas = input.nextInt();

            total += caixas;
            viagens++;

        } while (total < 50);

        System.out.println("Total de viagens: " + viagens);
        System.out.println("Total de caixas entregues: " + total);

    }
}

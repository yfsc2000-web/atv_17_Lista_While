package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_07 {
    static void main() {
        Scanner input = new Scanner(System.in);
        double consumo, total = 0;
        int turnos = 0;

        do {
            System.out.print("Informe o consumo (kWh) do turno [0 para encerrar]: ");
            consumo = input.nextDouble();

            if (consumo != 0) { // soma apenas se não for 0
                total += consumo;
                turnos++;
            }

        } while (consumo != 0); // repete até o operador digitar 0

        if (turnos > 0) {
            double media = total / turnos;
            System.out.println("\nMédia por turno: " + media);
            System.out.println("Total consumido: " + total + " kWh");
        } else {
            System.out.println("\nNenhum consumo registrado.");
        }

    }
}

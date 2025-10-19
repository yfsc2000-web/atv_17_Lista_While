package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_15 {
    static void main() {
        Scanner input = new Scanner(System.in);
        double valor;
        // Faixa aceitável: intervalo de valores considerados corretos ou seguros para operação.
        //  No caso do sensor, valores entre 4.0 e 20.0 mA são considerados dentro da faixa aceitável.
        //Valores fora desse intervalo indicam calibração incorreta ou erro no sensor.
        do {
            System.out.print("Digite o valor calibrado do sensor (mA): ");
            valor = input.nextDouble();


            if (valor < 4.0 || valor > 20.0) {
                System.out.println(" Tente novamente.");
            }

        } while (valor < 4.0 || valor > 20.0);

        System.out.println("Calibração OK.");
    }
}

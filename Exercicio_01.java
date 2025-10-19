package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_01 {
    static void main() {
        Scanner input = new Scanner(System.in);
        double temperatura;

        do {
            System.out.print("Informe a temperatura (em ºC): ");
            temperatura = input.nextDouble();

            if (temperatura < 800 || temperatura > 1200) {
                System.out.println("Temperatura fora do intervalo. Tente novamente.");
            }

        } while (temperatura < 800 || temperatura > 1200);

        System.out.println("Temperatura válida: " + temperatura);

        input.close();
    }
}


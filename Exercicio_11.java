package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_11 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int umidade;

        do {
            System.out.print("Digite a umidade em %: ");
            umidade = input.nextInt();

            if (umidade > 30 && umidade < 55) {
                System.out.println("Umidade aceita!");
            } else {
                System.out.println("Umidade fora do intervalo. Tente novamente.");
            }
        } while (umidade <= 30 || umidade >= 55);
    }
}

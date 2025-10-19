package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_13 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int minutos = 0;

        do {
            System.out.print("Digite quantos minutos o tanque está batendo: ");
            minutos = input.nextInt();

            if (minutos < 10) {
                System.out.println(minutos + " minutos, ainda faltam " + (10 - minutos) + " minutos para completar os 10 minutos.");
            } else {
                System.out.println("Chegou ao limite de 10 minutos.");
            }
        } while (minutos < 10); // repete enquanto menor que 10

        System.out.println("Mistura concluída.");

        }
    }




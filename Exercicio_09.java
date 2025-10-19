package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_09 {
    static void main() {
        Scanner input = new Scanner(System.in);
        boolean resultado;
        int tentativas = 0;

        do {
            System.out.print("A peça passou no teste? (true/false): ");
            resultado = input.nextBoolean();
            tentativas++;
        } while (!resultado); // repete enquanto o teste falhar (false)

        System.out.println("Peça aprovada após " + tentativas + " tentativa(s).");
        input.close();
    }
}

package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_04 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int opcao = 1;

            do {
                System.out.println("1. Registrar parada");
                System.out.println("2. Registrar produção");
                System.out.println("3. Sair");
                int resposta = input.nextInt();

                if (opcao == 1)
                    System.out.println("Parada registrada.");
                else if (opcao == 2)
                    System.out.println("Produção registrada.");

                opcao++; // passa para a próxima opção

            } while (opcao < 3);

            System.out.println("Programa encerrado.");
        }
    }



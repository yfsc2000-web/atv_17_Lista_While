package Atv17_LIsta_Do_While;

import java.util.Scanner;

public class Exercicio_12 {
    static void main() {
        // MS (Warehouse Management System) é um
        // Sistema de Gestão de Armazéns, usado para controlar estoques, movimentação de produtos
        // recebimento, separação, conferência e expedição.
        Scanner input = new Scanner(System.in);
        int palete;
        int contagem = 0;

        do {
            System.out.print("Digite o número do palete (-1 para encerrar): ");
            palete = input.nextInt();

            if (palete != -1) {
                contagem++;
            }

        } while (palete != -1);

        System.out.println("Total de paletes conferidos: " + contagem);
    }
}

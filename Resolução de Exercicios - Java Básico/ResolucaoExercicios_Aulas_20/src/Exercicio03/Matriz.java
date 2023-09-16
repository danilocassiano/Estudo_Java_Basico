package Exercicio03;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3]; // Cria uma matriz 3x3

        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Informe o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }

        // Exibir a matriz preenchida
        System.out.println("Matriz informada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


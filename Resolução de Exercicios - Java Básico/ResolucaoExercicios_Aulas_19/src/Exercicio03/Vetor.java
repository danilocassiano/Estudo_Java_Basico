package Exercicio03;

public class Vetor {
    public static void main(String[] args) {
        int [] vetorA = new int[15];
        int [] vetorB = new int[15];

        vetorA [0] = 1;
        vetorA [1] = 2;
        vetorA [2] = 3;
        vetorA [3] = 4;
        vetorA [4] = 5;
        vetorA [5] = 6;
        vetorA [6] = 7;
        vetorA [7] = 8;
        vetorA [8] = 9;
        vetorA [9] = 10;
        vetorA [10] = 11;
        vetorA [11] = 12;
        vetorA [12] = 13;
        vetorA [13] = 14;
        vetorA [14] = 15;

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = (int) Math.pow(vetorA[i],2);
        }

        System.out.println("Vetor B:");
        for(int i = 0; i < vetorB.length; i++){
            System.out.println("B [" + i + "] = " + vetorB[i]);
        }
    }
}

package Exercicio01;

public class Vetor {
    public static void main(String[] args) {

        int [] vetorA = new int[5];
        int [] vetorB = new int[5];

        vetorA [0] = 1;
        vetorA [1] = 2;
        vetorA [2] = 3;
        vetorA [3] = 4;
        vetorA [4] = 5;

        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }

        System.out.println("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.println("B[" + i + "] = " + vetorB[i]);
        }
    }
}

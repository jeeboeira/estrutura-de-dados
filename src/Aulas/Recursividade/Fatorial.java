package Aulas.Recursividade;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Iterativa: " + fatorialIterativa(4));
        System.out.println("Recursiva: " + fatorialRecursiva(4));

    }

    public static int fatorialIterativa(int N) {//Solução iterativa
        int fat = 1;

        for (int i = 1; i <= N; i++) {
            fat = fat * i;
        }
        return fat;
    }

    public static int fatorialRecursiva(int N) {//Solução Recursiva
        if (N == 1) {//BASE
            return 1;
        } else {//N>1
            return N * fatorialRecursiva(N - 1);
        }
    }


}

package Aulas.Recursividade;

public class Fatorial {
    public static void main(String[] args) {
        System.out.println("Iterativa: " + fatorialIterativa(4));
        System.out.println("Recursiva: " + fatorialRecursiva(4));
        System.out.println("Fibonacci Iterativa: " + fibonacciIterativa(47));
        System.out.println("Fibonacci Recursiva: " + fibonacciRecursiva(47));
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

    public static int fibonacciIterativa(int index){
        int T0 = 1;
        int T1 = 1;
        int termo = 0;
        for (int i = 0; i < index-1; i++) {
            termo = T0 + T1;
            T0 = T1;
            T1 = termo;
        }
        return termo;
    }

    public static int fibonacciRecursiva(int index){
        if (index == 0 || index == 1) {//BASE
            return 1;
        }
        else {//PASSO
            return fibonacciRecursiva(index - 1) + fibonacciRecursiva(index - 2);
        }
    }
}

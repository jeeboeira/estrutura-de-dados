package Aulas.Recursividade;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Fibonacci Iterativa: " + fibonacciIterativa(47));
        System.out.println("Fibonacci Recursiva: " + fibonacciRecursiva(47));
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

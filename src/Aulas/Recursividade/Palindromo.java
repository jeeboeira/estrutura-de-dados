package Aulas.Recursividade;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.next();
        System.out.println(palindromo(palavra));
    }

    public static boolean palindromo(String palavra) {
        return palindromoRec(palavra, 0, palavra.length()-1);
    }

    public static boolean palindromoRec(String palavra, int i, int f) {
        if (palavra.charAt(i) != palavra.charAt(f)) {
            return false;
        } else if (palavra.charAt(i) >= palavra.charAt(f)) {
            return true;
        } else {
            return palindromoRec(palavra, i + 1, f - 1);
        }
    }
}

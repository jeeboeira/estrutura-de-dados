package AtividadePratica4;

import java.util.Scanner;

public class Calculadora {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String exp = scan.nextLine();
        String[] simbolos = exp.split(" ");
        for (String simb : simbolos) {
            System.out.println(simb);

        }
    }
    }

package AtividadePratica4;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Calculadora {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<String> filaInfixa = new LinkedBlockingQueue<>();
        Stack<String> pilhaConv = new Stack<>();
        Queue<String> filaPosFixa = new LinkedBlockingQueue<>();

        Passo1(filaInfixa);





        while (!filaInfixa.isEmpty()){
            if (filaInfixa.peek().equals("(")){
                pilhaConv.add(filaInfixa.poll());
            } else if (filaInfixa.peek().equals("+") || filaInfixa.peek().equals("-") || filaInfixa.peek().equals("/") ||filaInfixa.peek().equals("+") ) {

            }
        }

    }
    public static void Passo1 (Queue filaInfixa){
        String exp = scan.nextLine();
        String[] simbolos = exp.split(" ");

        for (String simb : simbolos) {
            filaInfixa.add(simb);
        }
    }
}

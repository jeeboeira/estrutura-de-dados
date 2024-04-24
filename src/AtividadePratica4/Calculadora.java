package AtividadePratica4;

import java.util.Comparator;
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
        Passo2(filaInfixa, pilhaConv, filaPosFixa);

    }


    public static void Passo1 (Queue filaInfixa){
        String exp = scan.nextLine();
        String[] simbolos = exp.split(" ");

        for (String simb : simbolos) {
            filaInfixa.add(simb);
        }
    }

    public static void Passo2 (Queue filaInfixa, Stack pilhaConv, Queue filaPosFixa) {
        while (!filaInfixa.isEmpty()){//passo2
            if (filaInfixa.peek().equals("(")){//passo6
                pilhaConv.add(filaInfixa.poll());//passo7
            } else if (filaInfixa.peek().equals("+") || filaInfixa.peek().equals("-")
                    || filaInfixa.peek().equals("/") ||filaInfixa.peek().equals("*") ) {
                while (!pilhaConv.isEmpty() && Comparator((String) filaInfixa.peek(), (String) pilhaConv.peek())){
                    filaPosFixa.add(pilhaConv.pop());
                }
                pilhaConv.add(filaInfixa.poll());
            } else if (filaInfixa.peek().equals(")")) {
                filaInfixa.poll();
                while (!pilhaConv.peek().equals("(")){
                    filaPosFixa.add(pilhaConv.pop());
                }
                pilhaConv.pop();
            }else {
                filaPosFixa.add(filaInfixa.poll());
            }
        }
        while (!pilhaConv.isEmpty()){
            filaPosFixa.add(pilhaConv.pop());
        }
        System.out.println("Final? " + filaPosFixa);
    }

    public static boolean Comparator (String filaInfixa, String pilhaConv) {
        int vlrFila = Atribueitor(filaInfixa);
        int vlrPilha = Atribueitor(pilhaConv);
        if(vlrPilha >= vlrFila){
            return true;
        }
        return false;
    }

    public static int Atribueitor (String opr) {
        switch (opr) {
            case "(" :
                return 0;
            case ")" :
                return 0;
            case "+" :
                return 1;
            case "-" :
                return 1;
            case "*" :
                return 2;
            case "/" :
                return 2;
        }
        return -1;
    }
}

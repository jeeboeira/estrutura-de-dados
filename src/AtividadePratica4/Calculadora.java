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
        Stack<Integer> pilhaCalc = new Stack<>();

        Passo1(filaInfixa);
        Passo2(filaInfixa, pilhaConv, filaPosFixa);
        Passo3(filaPosFixa, pilhaCalc);
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
            } else if (isOperando(filaInfixa)) {
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
        //System.out.println("FilaPosFixa: " + filaPosFixa);
    }

    public static void Passo3(Queue filaPosFixa, Stack pilhaCalc) {
        while (!filaPosFixa.isEmpty()){
            if (isOperando(filaPosFixa)){
                pilhaCalc.add(Resultado((String) filaPosFixa.poll(), (Integer) pilhaCalc.pop(), (Integer) pilhaCalc.pop()));
            } else {
                pilhaCalc.add(Integer.valueOf((String) filaPosFixa.poll()));
            }
        }
        System.out.println(pilhaCalc.peek());
    }

    public static Integer Resultado(String opr, Integer operandoA, Integer operandoB) {
        switch (opr) {
            case "+" :
                return operandoB + operandoA;
            case "-" :
                return operandoB - operandoA;
            case "*" :
                return operandoB * operandoA;
            case "/" :
                return operandoB / operandoA;
        }
        return -1;
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

    public static boolean isOperando(Queue filaInfixa) {
        if (filaInfixa.peek().equals("+") || filaInfixa.peek().equals("-")
                || filaInfixa.peek().equals("/") ||filaInfixa.peek().equals("*")) {
            return true;
        }
        return false;
    }
}

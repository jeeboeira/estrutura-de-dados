package AtividadePratica4;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedBlockingQueue<>();
        fila.add("a");
        fila.add("b");
        fila.add("c");
        fila.add("d");
        fila.add("e");
        fila.add("aag");
        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }
        //Comparator("+","c");
        System.out.println(Atribueitor("/"));
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

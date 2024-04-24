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
        Comparator("+","c");
    }
    public static boolean Comparator (String a, String b){
        switch (a) {
            case "-" :
                int aa = 1;
                break;
            case "+" :
                aa = 1;
                break;
        }
        return true;
    }
}

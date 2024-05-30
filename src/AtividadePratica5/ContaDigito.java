/* 2. Implemente uma função recursiva que determine quantas vezes um dígito K ocorre em um
número inteiro (positivo) N. Por exemplo, o dígito K=2 ocorre 3 vezes no número
N=762021192.
 */
package AtividadePratica5;

import java.util.Stack;

public class ContaDigito {
    public static void main(String[] args) {


        System.out.println(contaDigito(2, 762021192));

    }

    public static void contaDigito(int K, int N){
        String nString = String.valueOf(N);
        String kString = String.valueOf(K);
        return contaDigitoRec(kString, nString 0);
    }

    public static boolean contaDigitoRec(String K, String N, int i) {
        if (N.charAt(i) != K){
            return false;
        } else {
            return contaDigito();
        }
    }
}

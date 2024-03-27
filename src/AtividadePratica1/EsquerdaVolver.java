//https://www.beecrowd.com.br/judge/pt/problems/view/1437
package AtividadePratica1;

import java.util.Scanner;

public class EsquerdaVolver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while (n != 0){
            int value = 0;
            for (int i=0; i<n; i++){
                String comandos = scan.next();
                for (int j = 0; j < comandos.length(); j++){
                    if(comandos.charAt(j) == 'D'){
                        value++;
                    } else if (comandos.charAt(j) == 'E') {
                        value--;
                    }
                }
                value = value%4;
                //System.out.println(value);
                if (value == 0){
                    System.out.println("N");
                } else if (value == 1 || value == -3) {
                    System.out.println("L");
                } else if (value == 2 || value == -2) {
                    System.out.println("S");
                } else if (value == 3 || value == -1) {
                    System.out.println("O");
                }
                value = 0;
                n = scan.nextInt();
            }
        }
    }
}
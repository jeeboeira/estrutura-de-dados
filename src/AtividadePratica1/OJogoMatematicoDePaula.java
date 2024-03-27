//https://www.beecrowd.com.br/judge/pt/problems/view/1192
package AtividadePratica1;

import java.util.Scanner;

public class OJogoMatematicoDePaula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i =0; i < n; i++){
            String caracteres = scan.next();

            char letra = caracteres.charAt(1);
            int n1 = caracteres.charAt(0) - '0';
            int n2 = caracteres.charAt(2) - '0';

            if (n1 == n2){
                System.out.println(n1*n2);
            } else if(Character.isUpperCase(letra)){
                System.out.println(n2-n1);
            }else if(Character.isLowerCase(letra)){
                System.out.println(n2+n1);
            }
        }
    }
}

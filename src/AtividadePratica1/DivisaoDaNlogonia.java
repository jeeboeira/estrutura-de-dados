//https://www.beecrowd.com.br/judge/pt/problems/view/1091
package AtividadePratica1;

import java.util.Scanner;

public class DivisaoDaNlogonia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();

        while (k != 0){
            int n = scan.nextInt();
            int m = scan.nextInt();

            for (int i=0; i<k; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();

                if (x == n || y == m){
                    System.out.println("divisa");
                }
                if(x < n && y > m){
                    System.out.println("NO");
                }
                if(x > n && y > m){
                    System.out.println("NE");
                }
                if(x > n && y < m){
                    System.out.println("SE");
                }
                if(x < n && y < m){
                    System.out.println("SO");
                }
            }
            k = scan.nextInt();
        }

    }
}

//https://www.beecrowd.com.br/judge/pt/problems/view/1103
package AtividadePratica1;

import java.util.Scanner;

public class AlarmeDespertador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String time = scan.nextLine();

        while (!time.equals("0 0 0 0")){
            String[] timeSplit = time.split(" ");
            int[] timeArray = new int[timeSplit.length];

            for (int i = 0; i < timeSplit.length; i++) {
                timeArray[i] = Integer.valueOf(timeSplit[i]);
            }

            int horaAtual = ((timeArray[0]*60)+timeArray[1]);
            int horaDespertador = ((timeArray[2]*60)+timeArray[3]);
            int tempoRestante = horaDespertador-horaAtual;
            if (tempoRestante < 0){
                tempoRestante = tempoRestante + 1440;
            }
            System.out.println(tempoRestante);
            time = scan.nextLine();
        }
    }
}

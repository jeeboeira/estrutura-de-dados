//https://www.beecrowd.com.br/judge/pt/problems/view/1383
package AtividadePratica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sudoku {
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
            String[] arrayEntrada = new String[9];
            String[] arraySemEspaco = new String[9];
            int[][] matrizSudoku = new int[9][9];
            int instancias = 0;

            instancias = Integer.valueOf(scan.nextLine());

            for (int i = 0; i < instancias; i++) {
                lerEntradas(arrayEntrada);
                retiraEspaços(arrayEntrada, arraySemEspaco);
                InsereDadosMatrizSudoku(arraySemEspaco, matrizSudoku);
                System.out.printf("Instancia %d%n", i + 1);
                Validacao(matrizSudoku);
            }
        }

        public static void lerEntradas(String arrayEntrada[]) {
            //Lê as Entradas dos dados
            for (int i = 0; i < arrayEntrada.length; i++) {
                arrayEntrada[i] = scan.nextLine();
            }
        }

        public static void retiraEspaços(String arrayEntrada[], String arraySemEspaco[]) {
            //retirar espaços do arrayEntrada e envia para arraySemEspaco
            for (int i = 0; i < arrayEntrada.length; i++) {
                arraySemEspaco[i] = arrayEntrada[i].replaceAll("\\s+", "");
            }
        }

        public static void InsereDadosMatrizSudoku(String arraySemEspaco[], int matrizSudoku[][]) {
            //Insere os dados na matrizSudoku
            for (int i = 0; i < arraySemEspaco.length; i++) {
                for (int j = 0; j < arraySemEspaco.length; j++) {
                    matrizSudoku[i][j] = arraySemEspaco[i].charAt(j) - '0';
                }
            }
        }

        public static boolean Validacao(int matrizSudoku[][]) {
            List<Integer> listA = new ArrayList<Integer>();
            List<Integer> listb = new ArrayList<Integer>();
            for (int i = 0; i < 9; i++) {
                listb.add(i + 1);
            }
            boolean validacao = false;

            //validação horizontal
            for (int i = 0; i < matrizSudoku.length; i++) {
                listA.clear();
                for (int j = 0; j < matrizSudoku.length; j++) {
                    listA.add(matrizSudoku[i][j]);
                }
                validacao = listA.containsAll(listb);
                if (!validacao) {
                    break;
                }
            }

            //validação vertical
            if (validacao) {
                for (int i = 0; i < matrizSudoku.length; i++) {
                    listA.clear();
                    for (int j = 0; j < matrizSudoku.length; j++) {
                        listA.add(matrizSudoku[j][i]);
                    }
                    validacao = listA.containsAll(listb);
                    if (!validacao) {
                        break;
                    }
                }
            }

            //validação do quadrado 01 ta feito é isso porra
            if (validacao) {
                for (int g = 0; g < 9; g = g + 3) {
                    for (int h = 0; h < 9; h = h + 3) {
                        listA.clear();
                        for (int i = g; i < g + 3; i++) {
                            for (int j = h; j < h + 3; j++) {
                                listA.add(matrizSudoku[i][j]);
                            }
                        }
                        validacao = listA.containsAll(listb);
                        if (!validacao) {
                            break;
                        }
                    }
                }
            }
            if (validacao){
                System.out.println("SIM\n");
            }
            else {
                System.out.println("NAO\n");
            }
            return validacao;
        }
    }
// 1 2 3 4 5 6 7 8 9


package AtividadePratica6;

import AtividadePratica6.ArvoreTAD;

import java.util.Scanner;

public class MainArvore {
    public static void main(String[] args) {
        ArvoreTAD arv = new ArvoreTAD();
        Scanner scan = new Scanner(System.in);

        int op = 0;
        while(op != 9) {

            System.out.println("==================");
            System.out.println("MENU DE OPERAÇÕES:");
            System.out.println("==================");
            System.out.println();
            System.out.println("Digite o número da Operação:");
            System.out.println();

            System.out.println("1 - Insere elemento na árvore");
            System.out.println("2 - Imprimir elementos da árvore");
            System.out.println("3 - Pesquisa por um elemento na árvore");
            System.out.println("4 - Verifica se está vazia");
            System.out.println("5 - Remove item");
            System.out.println("6 - Limpa a árvore");
            System.out.println("7 - Realiza o balanceamento estático");
            System.out.println("8 - Cria um vetor em ordem");
            System.out.println("9 - Sair");
            op = scan.nextInt();

            if(op == 1) {
                System.out.println("Digite o valor que deseja inserir: ");
                arv.insere(scan.nextInt());
            }
            else if(op == 2) {
                arv.menuImpressao();
            }
            else if(op == 3) {
                System.out.println("Digite o valor que deseja pesquisar: ");
                if(arv.pesquisa(scan.nextInt())){
                    System.out.println("O valor foi encontrado");
                }else {
                    System.out.println("Valor inexistente");
                }
            }
            else if(op == 4) {
                if (arv.estaVazia()) {
                    System.out.println("Árvore vazia");
                }else {
                    System.out.println("A árvore não está vazia");
                }
            }
            else if(op == 5) {
                System.out.println("Digite o valor que deseja remover: ");
                arv.remove(scan.nextInt());
                System.out.println("Valor removido com sucesso!");
            }
            else if(op == 6) {
                arv.limpa();
                arv.estaVazia();
            }
            else if(op == 7) {
                arv.balanceamentoEstatico();
                arv.imprimeArvore();
            }
            else if(op == 8) {
                System.out.println(arv.criaVetorEmOrdem());
            }
        }
    }
        /*
        ##TESTE##

        System.out.println(arv.estaVazia());
        System.out.println(arv.pesquisa(15));
        arv.insere(15);
        arv.insere(15);
        arv.insere(11);
        arv.insere(12);
        arv.insere(13);
        arv.insere(35);
        arv.insere(40);
        arv.insere(10);
        arv.insere(55);
        arv.insere(12);
        arv.insere(39);
        arv.imprimeArvore();
        System.out.println(arv.estaVazia());
        System.out.println(arv.pesquisa(10));
        System.out.println(arv.tamanho());
        System.out.println(arv.altura());
        arv.imprimeEmOrdem();
        System.out.println();
        arv.imprimePreOrdem();
        System.out.println();
        arv.imprimePosOrdem();
        System.out.println();
        System.out.println(arv.acessaMenor());
        System.out.println(arv.acessaMaior());
        System.out.println(arv.criaVetorEmOrdem());
        arv.balanceamentoEstatico();
        arv.imprimeArvore();
        arv.limpa();
        System.out.println(arv.estaVazia());
        System.out.println(arv.pesquisa(15));
        arv.insere(39);
        arv.imprimeArvore();
       */
}

package AtividadePratica6;

import AtividadePratica6.Nodo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArvoreTAD {
    Scanner scan = new Scanner(System.in);
    private Nodo raiz;

    // 3)a.
    public ArvoreTAD() {
        raiz = null;
    }

    // 3)b.
    public int tamanho() {
        if (estaVazia()) {
            System.out.println("0");
        }
        return tamanhoRec(raiz);
    }

    private int tamanhoRec(Nodo n) {
        if (n == null) {
            return 0;
        }
        return 1 + tamanhoRec(n.esq) + tamanhoRec(n.dir);
    }

    // 3)c.
    public int altura() {
        if (estaVazia()) {
            System.out.println("0");
        }
        return alturaRec(raiz);
    }

    private int alturaRec(Nodo n) {
        if (n == null) {
            return 0;
        }
        return 1 + Math.max(alturaRec(n.esq), alturaRec(n.dir));
    }

    // 3)d.
    public boolean estaVazia() {
        return raiz == null;
    }

    // 3)e.
    public void insere(int elem) {
        if (estaVazia()) {
            raiz = new Nodo(elem);
            System.out.println("Valor inserido");
        } else {
            insereRec(elem, raiz);
        }
    }

    private void insereRec(int elem, Nodo n) {
        if (elem == n.elem) {
            System.out.println("Elemento repetido");
            return;
        } else if (elem > n.elem) {
            if (n.dir == null) {
                n.dir = new Nodo(elem);
                System.out.println("Valor inserido");
            } else {//n.dir != null
                insereRec(elem, n.dir);
            }
        } else {
            if (elem < n.elem) {
                if (n.esq == null) {
                    n.esq = new Nodo(elem);
                    System.out.println("Valor inserido");
                } else {//n.esq != null
                    insereRec(elem, n.esq);
                }
            }
        }
    }

    // 3)f.I
    public void imprimeEmOrdem() {
        if (estaVazia()) {
            System.out.println("Lista Vazia");
        }
        imprimeEmOrdemRec(raiz);
        System.out.println();
    }

    private void imprimeEmOrdemRec(Nodo n) {
        if (n.esq != null) {
            imprimeEmOrdemRec(n.esq);
        }
        System.out.print(n.elem + " ");
        if (n.dir != null) {
            imprimeEmOrdemRec(n.dir);
        }
    }

    // 3)f.II
    public void imprimePreOrdem() {
        if (estaVazia()) {
            System.out.println("Lista Vazia");
        }
        imprimePreOrdemRec(raiz);
        System.out.println();
    }

    private void imprimePreOrdemRec(Nodo n) {
        System.out.print(n.elem + " ");
        if (n.esq != null) {
            imprimePreOrdemRec(n.esq);
        }
        if (n.dir != null) {
            imprimePreOrdemRec(n.dir);
        }
    }

    // 3)f.III
    public void imprimePosOrdem() {
        if (estaVazia()) {
            System.out.println("Lista Vazia");
        }
        imprimePosOrdemRec(raiz);
        System.out.println();
    }

    private void imprimePosOrdemRec(Nodo n) {
        if (n.esq != null) {
            imprimePosOrdemRec(n.esq);
        }
        if (n.dir != null) {
            imprimePosOrdemRec(n.dir);
        }
        System.out.print(n.elem + " ");
    }

    // 3)f.IV
    /****************************/
    /* MÉTODO JÁ IMPLEMENTADO   */

    /****************************/
    public void imprimeArvore() {
        this.imprimeArvoreRec(this.raiz, 0);
    }

    private void imprimeArvoreRec(Nodo n, int depth) {
        if (n == null) {
            return;
        }
        this.imprimeArvoreRec(n.dir, depth + 1);
        for (int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println(n.elem);
        this.imprimeArvoreRec(n.esq, depth + 1);
    }

    // 3)g.
    public void remove(int elem) {
        this.raiz = this.removeRec(elem, this.raiz);
    }

    private Nodo removeRec(int elem, Nodo n) {
        if (n == null) {
            return null;
        } else if (elem == n.elem) {
            if (n.esq == null && n.dir == null) {
                return null;
            } else if (n.esq == null) {
                return n.dir;
            } else if (n.dir == null) {
                return n.esq;
            } else {
                Nodo aux = n.dir;
                while (aux.esq != null) {
                    aux = aux.esq;
                }
                n.elem = aux.elem;
                n.dir = this.removeRec(aux.elem, n.dir);
            }
        } else if (elem < n.elem) {
            n.esq = removeRec(elem, n.esq);
        } else {
            n.dir = removeRec(elem, n.dir);
        }
        return n;
    }
    /******************************/
    /* FIM MÉTODO JÁ IMPLEMENTADO */

    /******************************/

    // 3)h.
    public boolean pesquisa(int elem) {
        return pesquisaRec(elem, raiz);
    }

    private boolean pesquisaRec(int elem, Nodo n) {
        if (n == null) {
            return false;
        } else if (elem == n.elem) {
            return true;
        } else if (elem < n.elem) {
            return pesquisaRec(elem, n.esq);
        } else {//elem > n.elem
            return pesquisaRec(elem, n.dir);
        }
    }

    // 3)i.
    public int acessaMenor() {
        if (estaVazia()) {
            System.out.println("Lista Vazia");
        }
        return acessaMenorRec(raiz);
    }

    private int acessaMenorRec(Nodo n) {
        while (n.esq != null) {
            n = n.esq;
        }
        return n.elem;
    }

    // 3)j.
    public int acessaMaior() {
        if (estaVazia()) {
            System.out.println("Lista Vazia");
        }
        return acessaMaiorRec(raiz);
    }

    private int acessaMaiorRec(Nodo n) {
        while (n.dir != null) {
            n = n.dir;
        }
        return n.elem;
    }

    // 3)k.
    public void limpa() {
        raiz = null;
    }

    // 3)l.
    public ArrayList<Integer> criaVetorEmOrdem() {
        ArrayList<Integer> vetor = new ArrayList<>();
        if (estaVazia()) {
            System.out.println("Lista Vazia");
        }
        criaVetorEmOrdem(raiz, vetor);
        return vetor;
    }
    private void criaVetorEmOrdem(Nodo n, ArrayList<Integer> vetor) {
        if (n.esq != null) {
            criaVetorEmOrdem(n.esq, vetor);
        }
        vetor.add(n.elem);
        if (n.dir != null) {
            criaVetorEmOrdem(n.dir, vetor);
        }
    }

    // 3)l.
    public void balanceamentoEstatico() {
        if (estaVazia()) {
            System.out.println("Lista Vazia");
        }
        ArrayList<Integer> vetorEmOrdem = criaVetorEmOrdem();
        limpa();
        preencheArvoreBinaria(vetorEmOrdem, 0, vetorEmOrdem.size());
    }

    private void preencheArvoreBinaria(ArrayList<Integer> vetorEmOrdem, int i, int f) {
        if (i<f){
            int meio = (i+f)/2;
            insere(vetorEmOrdem.get(meio));
            preencheArvoreBinaria(vetorEmOrdem, i, meio);
            preencheArvoreBinaria(vetorEmOrdem, meio+1, f);
        }
    }

    public void menuImpressao() {

        System.out.println("===============================");
        System.out.println("MENU DE OPERAÇÕES DE IMPRESSÃO:");
        System.out.println("===============================");
        System.out.println();
        System.out.println("Digite o número da Operação:");
        System.out.println();

        System.out.println("1 - Ordem Crescente");
        System.out.println("2 - Pré-ordem");
        System.out.println("3 - Pós-ordem");
        System.out.println("4 - Formato de árvore");
        System.out.println("5 - Acessa o menor elemento");
        System.out.println("6 - Acessa o maior elemento");
        System.out.println("7 - Quantidade de itens na árvore");
        System.out.println("8 - Altura da árvore");
        System.out.println("9 - Voltar");

        int i = scan.nextInt();
        switch (i){
            case 1:
                imprimeEmOrdem();
                break;
            case 2:
                imprimePreOrdem();
                break;
            case 3:
                imprimePosOrdem();
                break;
            case 4:
                imprimeArvore();
                break;
            case 5:
                int x = acessaMenor();
                System.out.println("O menor valor da árvore é "+x);
                break;
            case 6:
                int n = acessaMaior();
                System.out.println("O maior valor da árvore é "+n);
                break;
            case 7:
                int y = tamanho();
                System.out.println("A árvore possui "+y+" itens");
                break;
            case 8:
                int z = altura();
                System.out.println("A árvore possui "+z+" nós de altura");
                break;
            case 9:
                break;
        }
    }

}
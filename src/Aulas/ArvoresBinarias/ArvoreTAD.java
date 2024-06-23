package Aulas.ArvoresBinarias;

public class ArvoreTAD {

    private Nodo raiz;

    public ArvoreTAD() {
        raiz = null;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

   /* public int tamanho() {

        if (estaVazia()){
            System.out.println("0");
        } else {
           tamanhoRec(raiz);
        }
    }

    private int tamanhoRec(Nodo n) {
        if (n.esq != null){
            n = n.esq;
            tamanhoRec(n);
        }
    }

   /* public void limpa() {
        throw new NotImplementedException();
    }*/

    public void insere(int elem) {
        if (estaVazia()){
            raiz = new Nodo(elem);
        }
        else {
            insereRec(elem, raiz);
        }
    }

    private void insereRec(int elem, Nodo n) {
        if (elem == n.elem) {
            System.out.println("Elemento repetido");
            return;
        }else if (elem > n.elem){
            if (n.dir == null) {
                n.dir = new Nodo(elem);
            }
            else {//n.dir != null
                insereRec(elem, n.dir);
            }
        }else{
            if (elem < n.elem) {
                if (n.esq == null) {
                    n.esq = new Nodo(elem);
                } else {//n.esq != null
                    insereRec(elem, n.esq);
                }
            }
        }
    }

    public boolean pesquisa(int elem) {
        return pesquisaRec(elem, raiz);
    }

    private boolean pesquisaRec(int elem, Nodo n) {
        if (n == null){
            return false;
        }else if (elem == n.elem){
            return true;
        } else if (elem < n.elem) {
            return pesquisaRec(elem, n.esq);
        } else{//elem > n.elem
            return pesquisaRec(elem, n.dir);
        }
    }

   /* public void imprimeEmOrdem() {
        throw new NotImplementedException();
    }

    private void imprimeEmOrdemRec(Nodo n) {
        throw new NotImplementedException();
    }

    public void imprimePosOrdem() {
        throw new NotImplementedException();
    }

    private void imprimePosOrdemRec(Nodo n) {
        throw new NotImplementedException();
    }

    public void imprimePreOrdem() {
        throw new NotImplementedException();
    }

    private void imprimePreOrdemRec(Nodo n) {
        throw new NotImplementedException();
    }

    public int acessaMaior() {
        throw new NotImplementedException();
    }

    private int acessaMaiorRec(Nodo n) {
        throw new NotImplementedException();
    }

    public int acessaMenor() {
        throw new NotImplementedException();
    }

    private int acessaMenorRec(Nodo n) {
        throw new NotImplementedException();
    }

    public ArrayList<Integer> criaVetorEmOrdem(  ) {
        throw new NotImplementedException();
    }

    private void criaVetorEmOrdem(Nodo n, ArrayList<Integer> vetor) {
        throw new NotImplementedException();
    }

    public void balanceamentoEstatico() {
        throw  new NotImplementedException();
    }

    private void preencheArvoreBinaria(ArrayList<Integer> vetorEmOrdem, int i, int f) {
        throw new NotImplementedException();
    }

    /****************************/
    /* MÉTODOS JÁ IMPLEMENTADOS */
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
}

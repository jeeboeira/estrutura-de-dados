package AtividadePratica3;

public class ListaTAD {
    private Nodo inicio, fim;
    private int numElementos;

    public ListaTAD() {
        numElementos = 0;
        inicio = null;
        fim = null;
    }

    public int tamanho() {
        return numElementos;
    }

    public boolean estaVazia() {
        return numElementos == 0;
    }

    public void imprime(){
        Nodo aux = inicio;
        while (aux != null){
            System.out.print(aux.elem + " ");
            aux =aux.prox;
        }
    }

    public void imprimeReverso() {
        Nodo aux = fim;
        while (aux != null){
            System.out.print(aux.elem + " ");
            aux = aux.ant;
        }
    }

    @Override
    public String toString() {
        return "ListaTAD{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                ", numElementos=" + numElementos +
                '}';
    }

    //tratar os valores inválidos
    public int acessa(int pos) {
        Nodo aux = inicio;
            for (int i = 0; i < pos; i++) {
                aux = aux.prox;
            }
        return aux.elem;
    }

    public void insereFinal(int valor) {
        Nodo novo = new Nodo();
        novo.elem = valor;
        novo.prox = null;

        if (estaVazia()) {
            novo.ant = null;
            inicio = novo;
        }else {
            novo.ant = fim;
            fim.prox = novo;
        }
        fim = novo;
        numElementos++;
    }

    public void insereInicio(int valor) {
        Nodo novo = new Nodo();
        novo.elem = valor;
        novo.ant = null;

        if (estaVazia()) {
            novo.prox = null;
            fim = novo;
        }else {
            novo.prox = inicio;
            inicio.ant = novo;
        }
        inicio = novo;
        numElementos++;
    }

    //criar exceção para erro fora do tamanho
    public void insere(int pos, int valor) {
        Nodo aux = inicio;
        Nodo novo = new Nodo();
        novo.elem = valor;

        if (estaVazia()) {
            novo.ant = null;
            novo.prox = null;
            inicio = novo;
            fim = novo;
        }else {
            for (int i = 0; i < pos; i++) {
                aux = aux.prox;
            }
            novo.ant = aux.ant;
            aux.ant.prox = novo;
            novo.prox = aux;
            aux.ant = novo;
        }
        numElementos++;
    }

    public void removeFinal() {
        if (estaVazia()){
            System.out.println("Lista vazia, não há elemento a serem removidos");
        }else {
            fim.ant.prox=null;
            fim = fim.ant;
            numElementos--;
        }
    }

    public void removeInicio() {
        if (estaVazia()){
            System.out.println("Lista vazia, não há elemento a serem removidos");
        }else {
            inicio.prox.ant = null;
            inicio = inicio.prox;
            numElementos--;

        }
    }

    public void remove (int pos) {
        Nodo aux = inicio;

        if (estaVazia()){
            System.out.println("Lista vazia, não há elemento a serem removidos");
        }else {
            for (int i = 0; i < pos; i++) {
                aux = aux.prox;
            }
            aux.ant.prox = aux.prox;
            aux.prox.ant = aux.ant;
            numElementos--;

        }
    }

    public boolean pesquisa (int valor) {
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.elem == valor) {
                return true;
            }
            aux = aux.prox;
        }
        return false;
    }

    public void altera(int pos, int valor) {
        if (pos < numElementos && pos >= 0) {
            if (estaVazia()){
                System.out.println("Lista vazia, não há elemento a serem removidos");
            }else {
                Nodo aux = inicio;

                for (int i = 0; i < pos; i++) {
                    aux = aux.prox;
                }
                aux.elem = valor;
            }
        }
    }

    public void limpa() {
        inicio = null;
        fim = null;
    }
}

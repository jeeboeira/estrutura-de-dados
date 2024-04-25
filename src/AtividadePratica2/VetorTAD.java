package AtividadePratica2;

import java.util.Arrays;

public class VetorTAD {
    private int[] vetor;
    private int numElementos;

    public VetorTAD(int max) {
        vetor = new int[max];
        numElementos = 0;
    }

    public int tamanho() {
        return numElementos;
    }

    public boolean estaVazia() {
        return numElementos == 0;
    }

    public boolean estaCheia() {
        return vetor.length == numElementos;
    }

    public void imprime() {
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "VetorTAD{" +
                "vetor=" + Arrays.toString(vetor) +
                ", numElementos=" + numElementos +
                '}';
    }

    public int acessa (int pos) {
        int valor = 0;
        if (pos < 0 || pos > vetor.length) {
            System.out.print("Posição fora dos limites retorno ");
        }
        else {
           valor = vetor [pos];
        }
        return valor;
    }

    public void insereFinal(int valor) {
        if(estaCheia()) {
            System.out.println("Vetor cheio! Elemento não inserido!");
        }
        else {
            vetor[numElementos] = valor;
            numElementos ++;
        }
    }

    public void insereInicio(int valor) {
        if(estaCheia()) {
            System.out.println("Vetor cheio! Elemento não inserido!");
        }
        else {
            for (int i = numElementos; i >= 1 ; i--) {
                vetor[i] = vetor[i-1];
            }
            vetor[0] = valor;
            numElementos ++;
        }
    }

    public void insere(int pos, int valor) {
        if(estaCheia()) {
            System.out.println("Vetor cheio! Elemento não inserido!");
        } else if (pos == 0) {
            insereInicio(valor);
        } else if (pos >= numElementos - 1) {
            insereFinal(valor);
        } else{
            for (int i = numElementos; i >= pos + 1 ; i--) {
                vetor[i] = vetor[i-1];
            }
            vetor[pos] = valor;
            numElementos ++;
        }
    }

    public void removeFinal() {
        if (estaVazia()){
            System.out.println("Vetor vazio! Nenhum elemento removido!");
        }
        else vetor[numElementos-1]=0;
        numElementos--;
    }

    public void removeInicio() {
        if (estaVazia()){
            System.out.println("Vetor vazio! Nenhum elemento removido!");
        } else {
            for (int i = 0; i < numElementos - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            numElementos--;
            vetor[numElementos] = 0;
        }
    }

    public void remove(int pos) {
        if (estaVazia()){
            System.out.println("Vetor vazio! Nenhum elemento removido!");
        } else if (pos > numElementos - 1) {
            System.out.println("Posição fora dos limites");
        } else if (vetor[pos] == 0) {
            System.out.println("Posição vazia! Nenhum elemento removido!");
        } else {
            for (int i = pos; i <= numElementos - 2 ; i++) {
                vetor[i] = vetor[i+1];
            }
            vetor[numElementos-1]=0;
            numElementos--;
        }
    }

    public boolean pesquisa (int valor){
        for (int i = 0; i < numElementos; i++){
            if(valor == vetor[i]){
                return true;
            }
        }
        return false;
    }

    public void altera (int pos, int valor){
        if (pos > 0 && pos < numElementos) {
            vetor[pos]=valor;
        }
        else {
            System.out.println("Posição fora dos limites!");
        }
    }

    public void limpa () {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 0;
        }
    }
}

package AtividadePratica2;

import javax.imageio.IIOException;
import java.io.File;
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
    }

    @Override
    public String toString() {
        return "VetorTAD{" +
                "vetor=" + Arrays.toString(vetor) +
                ", numElementos=" + numElementos +
                '}';
    }

    //Não ta rolando, voltar aqui depois, ver se vou usar tratamento de exceção ou o que
    /*public int acessa(int pos) throws Exception {
        if (pos < 0 || pos > vetor.length) {
            System.out.println("Posição fora dos limites");
        }
        try {
            return vetor[pos];
        }
        catch (Exception e) {
            e.getStackTrace();
            System.out.println("oh");

        }
        return vetor[pos];
    }*/

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
            numElementos ++; //numElementos = numElementos + 1;
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

    /*voltar depois e resolver, quando inserir, jogar os outros pra frente, se ele estiver
    se ele estiver muito na frente, fazer voltar até a ultima próxima posição*/

    public void insere(int pos, int valor) {
        if(estaCheia()) {
            System.out.println("Vetor cheio! Elemento não inserido!");
        }
        else {
            vetor[pos] = valor;
            /*aqui me perdi muito, posso validar se o valor for == 0 e colocar numElem++
            porém se foi passado o valor 0 para alguma posição, ele vai ser um dado válido.
            e também vai dar problemas no insere inicio, final.
             */
            //numElementos ++; //numElementos = numElementos + 1;
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
        } else {
            vetor[pos] = 0;
            /* Teria que fazer a validação do local, se puxa os dados, se está na ultima posição
            coisas que vou revisar outra hora.*/
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

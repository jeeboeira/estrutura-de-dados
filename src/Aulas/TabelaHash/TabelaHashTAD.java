package Aulas.TabelaHash;

import java.util.LinkedList;

public class TabelaHashTAD {
    int M, N;
    LinkedList<Aluno> [] tabela;

    public TabelaHashTAD(int M){
        this.M = M;
        N = 0;
        tabela = new LinkedList[M];
        for (int i = 0; i < M; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int hash(String chave){
        //return chave % M;
        return Math.abs(chave.hashCode()) % M;
    }

    public void insere(Aluno aluno){
        int posicao = hash(aluno.getEmail());
        LinkedList<Aluno> lista = tabela[posicao];
        for (int i = 0; i < lista.size(); i++) {
            Aluno elem = lista.get(i);
            if (equals(elem.getMatricula())){
                lista.remove(i);
                break;
            }
        }
        lista.add(aluno);
    }

    public void imprime(){
        for (int i = 0; i < M; i++) {
            LinkedList<Aluno> lista = tabela[i];
            System.out.println("[" + i + "]" + lista);
        }
    }

    public Aluno pesquisa(String chave){
        int posicao = hash(chave);
        LinkedList<Aluno> lista = tabela[posicao];

        for (Aluno aluno : lista){
            if (equals(aluno.getEmail())){
                return aluno;
            }
        }
        return null;
    }
}

package Aulas.ArvoresBinarias;

public class MainArvore {
    public static void main(String[] args) {
        ArvoreTAD arv = new ArvoreTAD();

        System.out.println(arv.estaVazia());
        System.out.println(arv.pesquisa(15));
        arv.insere(15);
        arv.insere(15);
        arv.insere(35);
        arv.insere(11);
        arv.insere(40);
        arv.insere(10);
        arv.insere(55);
        arv.insere(12);
        arv.insere(39);
        arv.imprimeArvore();
        System.out.println(arv.estaVazia());
        System.out.println(arv.pesquisa(10));
    }

}

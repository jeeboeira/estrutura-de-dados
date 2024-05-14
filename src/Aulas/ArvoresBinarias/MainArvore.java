package Aulas.ArvoresBinarias;

public class MainArvore {
    public static void main(String[] args) {
        ArvoreTAD arv = new ArvoreTAD();

        arv.insere(55);
        arv.insere(35);
        arv.insere(60);
        arv.insere(15);
        arv.insere(25);
        arv.insere(70);

        System.out.println(arv.estaVazia());
        System.out.println(arv.pesquisa(15));
        arv.imprimeArvore();
        arv.imprimeEmOrdem();
    }

}

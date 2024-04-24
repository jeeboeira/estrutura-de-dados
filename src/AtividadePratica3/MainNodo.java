package AtividadePratica3;

public class MainNodo {
    public static void main(String[] args) {
        ListaTAD lista = new ListaTAD();
        System.out.println("Imprime");
        lista.imprime();
        System.out.println("fim do imprime");
        lista.insereFinal(10);
        lista.insereFinal(40);
        lista.insereFinal(90);
        lista.insereFinal(20);
        lista.insereInicio(33);
        lista.imprime();
        System.out.println("\nImprime reverso");
        lista.imprimeReverso();
        System.out.println("");
        System.out.println(lista.acessa(0));
        System.out.println(lista.acessa(1));
        System.out.println(lista.acessa(2));
        //System.out.println(lista.acessa(10));
        lista.insere(2,33);
        lista.insere(5,133);
        lista.imprime();
        System.out.println("\nRemove final");
        lista.removeFinal();
        lista.removeFinal();
        lista.insereFinal(400);
        lista.imprime();
        System.out.println("\nRemove inicio");
        lista.removeInicio();
        lista.insereInicio(350);
        lista.imprime();
        System.out.println("\nRemove");
        lista.remove(1);
        lista.insereInicio(444);
        lista.insereFinal(333);
        lista.imprime();
        System.out.println("\n" + lista.pesquisa(400));
        System.out.println("Altera");
        lista.altera(1,37);
        lista.imprime();
        System.out.println("\nLimpa");
        lista.limpa();
        lista.imprime();
    }
}

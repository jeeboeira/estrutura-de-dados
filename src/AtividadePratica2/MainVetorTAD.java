package AtividadePratica2;

import javax.imageio.IIOException;

public class MainVetorTAD {
    public static void main(String[] args) throws Exception {
        VetorTAD vet = new VetorTAD(5);

        //vet.insereFinal(10);
        //vet.insereFinal(20);
        //vet.insereFinal(30);

        //vet.insereInicio(100);
        //System.out.println(vet.pesquisa(30));
        //System.out.println(vet.pesquisa(666));
        //vet.removeFinal();

        System.out.println("imprime");
        vet.imprime();
        System.out.println("\nTamanho\n" + vet.tamanho());
        System.out.println("Está Vazia\n" + vet.estaVazia());

        System.out.println("Esta cheia\n" + vet.estaCheia());

        System.out.println("toString\n" + vet.toString());

        System.out.println("Insere Final");
        vet.insereFinal(33);
        vet.insereFinal(44);
        System.out.println("imprime");
        vet.imprime();
        vet.insereFinal(332);
        vet.insereFinal(445);

        System.out.println("Acessa");
        System.out.println(vet.acessa(0));
        System.out.println(vet.acessa(8));
        System.out.println(vet.acessa(-1));
        System.out.println(vet.acessa(3));

        System.out.println("Insere início");
        vet.insereInicio(13);
        System.out.println(vet.acessa(0));
        System.out.println("imprime");
        vet.imprime();
        vet.removeFinal();
        System.out.println("imprime");
        vet.imprime();
        vet.removeInicio();
        System.out.println("imprime");
        vet.imprime();
    }
}

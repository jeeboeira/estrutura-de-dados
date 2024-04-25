package AtividadePratica2;

public class MainVetorTAD {
    public static void main(String[] args) throws Exception {
        VetorTAD vet = new VetorTAD(5);

        vet.insereFinal(44);
        vet.insereFinal(55);
        vet.insere(0,33);
        vet.insere(1,10);
        vet.insereFinal(66);
        vet.insereFinal(108);
        vet.imprime();
        vet.remove(5);
        vet.remove(5);
        vet.remove(4);
        vet.remove(4);

        vet.imprime();
    }
}

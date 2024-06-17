package AtividadePratica5;

public class FuncoesRecursivas {
    public static void main(String[] args) {
        System.out.println("Exercício 1");
        System.out.println(div(1,1));
        System.out.println(div(1,2));
        System.out.println(div(5,4));

        System.out.println("Exercício 2");
        System.out.println(contaDigito(1, 762122192));
        System.out.println(contaDigito(9, 968437816));
        System.out.println(contaDigito(8, 845384386));

        System.out.print("Exercício 3");
        imprimeBinario(1);
        imprimeBinario(10);
        imprimeBinario(749);

        System.out.println();
        System.out.println("Exercício 4");
        System.out.println(mdc(10,15));
        System.out.println(mdc(30, 30));
        System.out.println(mdc(1,15));
    }
    //Ex.1
    public static int div(int x, int y) {
        if (x == y){
            return 1;
        } else if (x < y) {
            return 0;
        } else {
            return 1 + div(x-y,y);
        }
    }


    //Ex.2
    public static int contaDigito(int K, int N){
        String nString = String.valueOf(N);
        String kString = String.valueOf(K);
        return contaDigitoRec(kString, nString, 0);
    }
    public static int contaDigitoRec(String K, String N, int i) {
        int contador = 0;
        if (i >= N.length()){
            return 0;
        }
        if (N.charAt(i) == K.charAt(0)){
            contador++;
        }
        return contador + contaDigitoRec(K, N, i+1);
    }

    //Ex.3
    public static void imprimeBinario(int dec) {
        if (dec == 0){
            System.out.println();
            return;
        }
        imprimeBinario(dec/2);
        System.out.print(dec%2);
    }

    //Ex.4
    public static int mdc(int x, int y) {
        if (x == y) {
            return x;
        }

        if (x > y) {
            return mdc(x - y, y);
        }else {
            return mdc(y, x);
        }
    }
}

package AtividadePratica5;

public class FuncoesRecursivas {
    public static void main(String[] args) {
        System.out.println(div(1,1));
        System.out.println(div(1,2));
        System.out.println(div(5,4));

        System.out.println(contaDigito(2, 762021192));

    }
    public static int div(int x, int y) {
        if (x == y){
            return 1;
        } else if (x < y) {
            return 0;
        } else {
            return 1 + div(x-y,y);
        }
    }


    public static  int contaDigito(int K, int N){

    }
}

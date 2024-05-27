package Aulas.ConjuntosMapeamentos;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.TreeSet;

public class Conjunto {
    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();

        conjunto.add("Jessé");
        conjunto.add("Jessé");
        conjunto.add("Oliveira");
        conjunto.add("Boeira");
        conjunto.add("Manu");
        conjunto.add("jesse");
        conjunto.add("Marta");

        System.out.println(conjunto);
        System.out.println(conjunto.contains("jesse"));
        System.out.println((conjunto.contains("Pedro")));

        conjunto.remove("jesse");
        System.out.println(conjunto);

        HashSet<String> conjunto2 = new HashSet<>(); // Na tabela hash posso definir o tamanho do vetor,
                                                        // e fator de carga, HashSet<>(i:5, v:0.5F);

        conjunto2.add("Jessé");
        conjunto2.add("Jessé");
        conjunto2.add("Oliveira");
        conjunto2.add("Boeira");
        conjunto2.add("Manu");
        conjunto2.add("jesse");
        conjunto2.add("Marta");

        System.out.println(conjunto2);
        System.out.println(conjunto2.contains("jesse"));
        System.out.println((conjunto2.contains("Pedro")));

        conjunto2.remove("jesse");
        System.out.println(conjunto2);
    }
}

package Aulas.ConjuntosMapeamentos;

import java.util.HashMap;
import java.util.TreeMap;

public class MainAluno {
    public static void main(String[] args) {
        //TreeMap<Integer, Aluno> mapAlunos = new TreeMap<>();
        HashMap<Integer, Aluno> mapAlunos = new HashMap<>();

        mapAlunos.put(001, new Aluno(001, "Jessé", "je@..."));
        mapAlunos.put(002, new Aluno(002, "Boeira", "bo@..."));
        mapAlunos.put(003, new Aluno(003, "Oliveira", "ol@..."));
        mapAlunos.put(003, new Aluno(004, "Maria", "ma@..."));
        mapAlunos.put(005, new Aluno(005, "Roberval", "ro@..."));

        System.out.println(mapAlunos);
        System.out.println(mapAlunos.get(003));

        if (mapAlunos.containsKey(006)){
            System.out.println(mapAlunos.get(006));
        }

        for (int matricula : mapAlunos.keySet()){
            System.out.println(matricula + " - " + mapAlunos.get(matricula));
        }
    }
}

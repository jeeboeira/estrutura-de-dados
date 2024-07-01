package Aulas.Grafos;

import java.util.LinkedList;

public class GrafoTAD {
    private LinkedList<Integer>[] adj;
    private boolean ehDirigido;
    private int numVertices;

    public GrafoTAD(int numVertices, boolean ehDirigido) {
        this.numVertices = numVertices;
        this.ehDirigido = ehDirigido;
    }

}

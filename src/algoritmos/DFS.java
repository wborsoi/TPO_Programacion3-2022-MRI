package algoritmos;
import java.util.*;

import grafos.Grafo;

public class DFS {
	static void DFSRecursivo(Grafo grafo, int nodo, boolean visitado[]){
        visitado[nodo] = true;
        System.out.print("|" + nodo + "| ");;
 
        Iterator<Integer> aux = grafo.adyacentes[nodo].listIterator();
        while (aux.hasNext()) {
            int n = aux.next();
            if (!visitado[n])
            	DFSRecursivo(grafo, n, visitado);
        }
    }
 
    public static void BusquedaProfundidad(Grafo grafo, int v){
        boolean visited[] = new boolean[grafo.V];

        DFSRecursivo(grafo, v, visited);
    }
}

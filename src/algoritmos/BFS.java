package algoritmos;
import grafos.*;
import java.util.*;

public class BFS {
	public static void BusquedaAnchura(Grafo grafo, int origen) {
        boolean visitado[] = new boolean[grafo.V];

        LinkedList<Integer> cola = new LinkedList<Integer>();
        
        visitado[origen] = true;
        cola.add(origen);
 
        while (cola.size() != 0){
        	origen = cola.poll();
            System.out.print("|" + origen + "| ");
 
            Iterator<Integer> aux = grafo.adyacentes[origen].listIterator();
            while (aux.hasNext()){
                int nodo = aux.next();
                
                if (!visitado[nodo]){
                	visitado[nodo] = true;
                	cola.add(nodo);
                }
            }
        }
    }
}

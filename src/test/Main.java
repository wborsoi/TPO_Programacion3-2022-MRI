package test;
import algoritmos.*;
import grafos.*;

public class Main {
	public static void main(String args[]){
        Grafo grafo = new Grafo(7);
        
        grafo.agregarArista(1, 1);
        grafo.agregarArista(5, 1);
        grafo.agregarArista(4, 5);
        grafo.agregarArista(4, 3);
        grafo.agregarArista(3, 1);
        grafo.agregarArista(6, 3);
        grafo.agregarArista(2, 6);
 
        System.out.println("BFS partiendo del nodo 4");
        BFS.BusquedaAnchura(grafo, 4);
        
        System.out.println("\n");
        
        System.out.println("DFS partiendo del nodo 4");
        DFS.BusquedaProfundidad(grafo, 4);
    }
}

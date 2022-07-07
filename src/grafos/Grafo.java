package grafos;
import java.util.*;

public class Grafo {
	public int V;
    public LinkedList<Integer> adyacentes[];
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Grafo(int v){
        V = v;
        adyacentes = new LinkedList[v];
        for (int i = 0; i < v; ++i)
        	adyacentes[i] = new LinkedList();
    }
 
    public void agregarArista(int v, int w){
    	adyacentes[v].add(w);
    }
}

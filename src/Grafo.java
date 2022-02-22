import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
	LinkedList<Vertice> vertices;
	public LinkedList<Vertice> getVertices() {
		return vertices;
	}
	
	public boolean existeAresta(int x, int y) {
		return this.vertices.get(x).existeAresta(y); // arrumar com professor
	}

	private static final int listaDistancias[] = new int[95];
	static final int infinito= 100;
    
	public Grafo(int n) {
    	for(int i = 0; i <= 96; i++) {
    	this.vertices = new LinkedList<Vertice>();
    	}
    }

    public void addAresta(int u, int v) {
    	for (int i = 0; i < vertices.size() ; i++) {
    	vertices.get(i).adj.add(vertices.get(i));
    	}
    }
    
    public static void distanciaBuscaEmLargura (Grafo g, Vertice v) {
    	for(int i = 0; i < 95; i++) {
    		listaDistancias[i] = infinito;
    	}
    	Queue<Vertice> fila = new LinkedList<>();
    	listaDistancias[g.vertices.getFirst().nome] = 0;
    	fila.add(v);
    	while(!fila.isEmpty()) {
    		Vertice aux = fila.remove();
    		for(int i = 0; i < 95; i++) {
    			if(g.existeAresta(aux.getNome(), i) && listaDistancias[i] == infinito) {
    				listaDistancias[i] = listaDistancias[aux.getNome()]++;
    				fila.add(g.getVertices().get(i));
    			}
    		}
    	}
    	
    }
}


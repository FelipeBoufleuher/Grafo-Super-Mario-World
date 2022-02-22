import java.util.LinkedList;

public class Grafo {
	LinkedList<Vertice> vertices;
	
    public Grafo(int n) {
    	for(int i = 0; i <= 96; i++) {
    	this.vertices = new LinkedList<Vertice>();
    	}
    }

    public void addAresta(int u, int v) {
    	for (int i=0; i<vertices.size() ; i++) {
    	vertices.get(i).adj.add(vertices.get(i));
    	}
    }
    
    public Vertice buscaEmLargura (int u, int destino) {
    	for(int u  :vertices) {
    		
    	}
    }
}


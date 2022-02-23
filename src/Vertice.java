import java.util.List;
import java.util.LinkedList;

public class Vertice {
	int nome;
    List<Vertice> adj;
    int grauSaida;
    
    public List<Vertice> getAdj() {
		return adj;
	}

    public Vertice(int nome) {
        this.nome = nome;
        this.adj = new LinkedList<Vertice>();
    }

    public int getNome() {
		return nome;
	}

	public String toString() {
        
		return "Vertice(" + nome + ")";
    }
	
	public boolean existeAresta(int y) { // WTF JAVA FUNCIONA DIREITO
		for(Vertice v : adj) {
			if(v.nome == y) {
				return true;
			}	
			return false;
		}
	}
}

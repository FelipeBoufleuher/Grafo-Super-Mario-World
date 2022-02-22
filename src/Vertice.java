import java.util.List;
import java.util.LinkedList;

public class Vertice {
	int nome;
    List<Vertice> adj;
    int grauSaida;

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
}

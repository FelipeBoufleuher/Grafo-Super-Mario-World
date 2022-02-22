/* 
 */
public class Graus {

	public static void main(String[] args) {
		Grafo mapa = new Grafo(6);
        mapa.addAresta(0, 1);
        mapa.addAresta(0, 3);
        mapa.addAresta(1, 4);
        mapa.addAresta(2, 4);
        mapa.addAresta(2, 5);
        mapa.addAresta(3, 1);
        mapa.addAresta(4, 3);
        mapa.addAresta(5, 5);

        calcularGrausDeSaida(mapa);
        mostrarGrausDeSaida(mapa);
    }

    public static void calcularGrausDeSaida(Grafo g) {
       for (Vertice v : g.vertices) {
           v.grauSaida = 0;
       }

       for (Vertice v : g.vertices) {
           for (Vertice u : v.adj) {
               v.grauSaida += 1;
           }
       }
    }

    public static void mostrarGrausDeSaida(Grafo g) {
       for (Vertice v : g.vertices) {
           System.out.printf("%s.grauSaida = %d\n", v, v.grauSaida);
       }
	}
}

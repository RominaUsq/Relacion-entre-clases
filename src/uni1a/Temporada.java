package uni1a;

public class Temporada {
    private int numero;
    private int episodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Temporada " + numero + " (" + episodios + " episodios)";
    }
}
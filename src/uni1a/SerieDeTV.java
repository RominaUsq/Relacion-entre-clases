package uni1a;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
    }

    public void agregarTemporada(Temporada t) {
        temporadas.add(t);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("-- Serie de TV --");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración por episodio: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + (temporadas.isEmpty() ? "Ninguna" : temporadas));
        System.out.println();
    }
}
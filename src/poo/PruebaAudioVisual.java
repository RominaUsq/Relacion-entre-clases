package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        // Película con actores
        Pelicula peli = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        peli.agregarActor(new Actor("Sam Worthington", 44));
        peli.agregarActor(new Actor("Zoe Saldana", 42));

        // Serie con temporadas
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasía");
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));

        // Documental con investigadores
        Documental doc = new Documental("Cosmos", 45, "Ciencia", "Astronomía");
        doc.agregarInvestigador(new Investigador("Carl Sagan", "Astrofísico"));

        // Mostrar detalles de cada contenido
        ContenidoAudiovisual[] contenidos = { peli, serie, doc };
        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }
    }
}

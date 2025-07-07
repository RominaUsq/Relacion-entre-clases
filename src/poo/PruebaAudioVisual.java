// ------ PruebaAudioVisual.java ------
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

        // Tráiler de película
        Trailer trailer = new Trailer(
            "Avatar - Tráiler Oficial", 
            3, "Acción", 
            "Avatar", 
            0.15f  // Muestra el 15% del contenido original
        );

        // Clip musical
        ClipMusical clip = new ClipMusical(
            "Bohemian Rhapsody", 
            6, "Rock", 
            "Queen", 
            354  // 5 minutos 54 segundos = 354 segundos
        );

        // Mostrar todos los contenidos
        ContenidoAudiovisual[] lista = { peli, serie, doc, trailer, clip };
        for (ContenidoAudiovisual c : lista) {
            c.mostrarDetalles();
        }
    }
}

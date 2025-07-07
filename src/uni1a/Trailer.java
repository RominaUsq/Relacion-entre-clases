// ------ Trailer.java ------
package uni1a;

/**
 * Subclase de ContenidoAudiovisual que representa un tráiler.
 * Incluye la película asociada y un índice de “spoiler” o porcentaje de censura.
 */
public class Trailer extends ContenidoAudiovisual {
    private String peliculaAsociada;  // Título de la película de la que hace el tráiler
    private float porcentajeCensura;  // Valor entre 0.0 y 1.0 que indica cuánta parte del contenido original muestra

    /**
     * @param titulo             Título del tráiler
     * @param duracionEnMinutos  Duración del tráiler en minutos
     * @param genero             Género (normalmente coincide con la película)
     * @param peliculaAsociada   Nombre de la película original
     * @param porcentajeCensura  Porcentaje de contenido revelado (0.0 = nada, 1.0 = todo)
     */
    public Trailer(String titulo, int duracionEnMinutos, String genero,
                   String peliculaAsociada, float porcentajeCensura) {
        super(titulo, duracionEnMinutos, genero);
        this.peliculaAsociada = peliculaAsociada;
        this.porcentajeCensura = porcentajeCensura;
    }

    public String getPeliculaAsociada() {
        return peliculaAsociada;
    }

    public void setPeliculaAsociada(String peliculaAsociada) {
        this.peliculaAsociada = peliculaAsociada;
    }

    public float getPorcentajeCensura() {
        return porcentajeCensura;
    }

    public void setPorcentajeCensura(float porcentajeCensura) {
        this.porcentajeCensura = porcentajeCensura;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("-- Trailer --");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Película asociada: " + peliculaAsociada);
        // Usamos printf para formatear porcentaje
        System.out.printf("Porcentaje de contenido revelado: %.0f%%%n", porcentajeCensura * 100);
        System.out.println();
    }
}

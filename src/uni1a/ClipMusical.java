// ------ ClipMusical.java ------
package uni1a;

/**
 * Subclase de ContenidoAudiovisual para clips musicales.
 * Añade información de artista y de la duración real del audio.
 */
public class ClipMusical extends ContenidoAudiovisual {
    private String artista;          // Nombre del artista o banda
    private int duracionAudioSeg;    // Duración de la pista en segundos

    /**
     * Constructor principal.
     * @param titulo               Título del clip
     * @param duracionEnMinutos    Duración del vídeo en minutos
     * @param genero               Género musical
     * @param artista              Nombre del artista o banda
     * @param duracionAudioSeg     Duración de la canción en segundos
     */
    public ClipMusical(String titulo, int duracionEnMinutos, String genero,
                       String artista, int duracionAudioSeg) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
        this.duracionAudioSeg = duracionAudioSeg;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracionAudioSeg() {
        return duracionAudioSeg;
    }

    public void setDuracionAudioSeg(int duracionAudioSeg) {
        this.duracionAudioSeg = duracionAudioSeg;
    }

    /**
     * Muestra detalles del clip, incluyendo artista y duración exacta de la pista.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("-- Clip Musical --");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración del vídeo: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Artista: " + artista);
        System.out.println("Duración de la pista: " + duracionAudioSeg + " seg");
        System.out.println();
    }
}

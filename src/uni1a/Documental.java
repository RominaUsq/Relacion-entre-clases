package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores = new ArrayList<>();

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public void agregarInvestigador(Investigador inv) {
        investigadores.add(inv);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("-- Documental --");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + tema);
        System.out.println("Investigadores: " + (investigadores.isEmpty() ? "Ninguno" : investigadores));
        System.out.println();
    }
}
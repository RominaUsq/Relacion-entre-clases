package uni1a;

/**
 * Representa un actor con nombre y edad.
 * Se usará en películas para asociar información de reparto.
 */
public class Actor {
    private String nombre;   // Nombre completo del actor
    private int edad;        // Edad del actor en años

    /**
     * Constructor que inicializa los campos clave.
     * @param nombre Nombre del actor
     * @param edad Edad del actor en años
     */
    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * @return Nombre del actor
     */
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * @return Edad del actor en años
     */
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    /**
     * Devuelve una representación legible del actor, combinando nombre y edad.
     */
    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

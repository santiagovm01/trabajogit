package libreria;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa un chatbot simple.
 * Utiliza un modelo de lenguaje para generar respuestas.
 *
 * @author santiago
 * @version 1.0
 * @since 2024-04-02
 */
public class Librerias {
    // Atributos
    private List<Libro> libros;

    /**
     * Constructor de la clase Library.
     */
    public Librerias() {
        this.libros = new ArrayList<>();
    }

    /**
     * Este método añade un libro a la libreria.
     *
     * @param libro El libro a añadir.
     */
    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    /**
     * Este método devuelve todos los libros de la libreria.
     *
     * @return Una lista de libros.
     */
    public List<Libro> getLibros() {
        return libros;
    }
}
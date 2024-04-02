package libreria;
import java.util.ArrayList;
import java.util.List;
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


}
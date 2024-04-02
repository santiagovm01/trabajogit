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
     * Este método añade un libro a la biblioteca.
     *
     * @param libro El libro a añadir.
     */
    public void addBook(Libro libro) {
        this.libros.add(libro);
    }

    /**
     * Este método devuelve todos los libros de la biblioteca.
     *
     * @return Una lista de libros.
     */
    public List<Libro> getBooks() {
        return libros;
    }
}
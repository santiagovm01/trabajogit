package libreria;
/**
 * Esta clase representa un libro en una biblioteca.
 *
 * @author Tu nombre
 * @version 1.0
 * @since 1.0
 */
public class Libro {

    // Atributos
    private String titulo;
    private String autor;

    /**
     * Constructor de la clase Book.
     *
     * @param titulo  El título del libro.
     * @param autor El autor del libro.
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * Este método devuelve el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Este método establece el título del libro.
     *
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Este método devuelve el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     *
     *
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
}

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
     *
     *
     * @param titulo  El título del libro.
     * @param autor El autor del libro.
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     *
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     *
     *
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }




}

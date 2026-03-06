public class Livro {

    private String titulo;
    private String autor;
    private String categoria;

    public boolean comparar(Livro livro) {
        if (titulo.equals(livro.titulo) && autor.equals(livro.autor) && categoria.equals(livro.categoria)) return true;
        return false;
    }

    public Livro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }

    public void setCategoria(String categoria){ this.categoria = categoria; }

}

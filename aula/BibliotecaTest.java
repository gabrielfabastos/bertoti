import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void test() {

        Biblioteca bib = new Biblioteca();

        bib.cadastrarLivro(new Livro("Livro de Java", "John", "Java"));

        List<Livro> encontrados = bib.buscarLivroTitulo("Livro de Java");

        assertEquals("John", encontrados.get(0).getAutor());

        List<Livro> encontrados2 = bib.buscarLivroTitulo(String.valueOf(new Livro("Livro de Java", "John", "Java")));
    }

}
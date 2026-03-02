import java.util.List;

import static org.junit.Assert.assertEquals;
public class Test {

    void test() {

        Biblioteca bib = new Biblioteca();

        bib.cadastrarLivro(new Livro("Livro de Java", "John"));

        List<livro> encontrados = bib.buscarLivroTitulo("Livro de Java");

        assertEquals(encontrados.get(0).getAutor(), "John");
    }
}

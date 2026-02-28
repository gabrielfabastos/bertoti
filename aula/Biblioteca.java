import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new LinkedList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> buscarLivroTitulo(String titulo){
        List<Livro> encontrados = new LinkedList<>();
        for (Livro livro:livros) {
            if (livro.getTitulo().equals(titulo))
                encontrados.add(livro);
        }
        return encontrados;
    }

    public List<Livro> getLivros(){
        return livros;
    }
}

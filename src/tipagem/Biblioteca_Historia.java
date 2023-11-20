package tipagem;

public class Biblioteca_Historia extends Biblioteca_Central {

    protected String livro_historia;
    protected String editora_historia;

    public Biblioteca_Historia(String livro_historia, String editora_historia) {
        super(livro_historia, editora_historia);
        this.livro_historia = livro_historia;
        this.editora_historia = editora_historia;
    }

    public String getLivro_Historia() {
        return livro_historia;
    }

    public String getEditora_Historia() {
        return editora_historia;
    }
}


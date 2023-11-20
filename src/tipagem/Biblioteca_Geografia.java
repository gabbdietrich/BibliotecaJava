package tipagem;

public class Biblioteca_Geografia extends Biblioteca_Central {

    protected String livro_geografia;
    protected String editora_geografia;

    public Biblioteca_Geografia(String livro_geografia, String editora_geografia) {
        super(livro_geografia, editora_geografia);
        this.livro_geografia = livro_geografia;
        this.editora_geografia = editora_geografia;
    }

    public String getLivro_Geografia() {
        return livro_geografia;
    }

    public String getEditora_Geografia() {
        return editora_geografia;
    }
}
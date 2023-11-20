package tipagem;

public class Biblioteca_Biologia extends Biblioteca_Central{

            protected String livro_biologia;
            protected String editora_biologia;

            Biblioteca_Biologia (String livro_biologia, String editora_biologia){
                super(livro_biologia, editora_biologia);
                this.livro_biologia= livro_biologia;
                this.editora_biologia = editora_biologia;
            }

            public String getLivro_Biologia(){
                    return livro_biologia;
            }
            public String getEditora_Biologia(){
                return editora_biologia;
            }
}
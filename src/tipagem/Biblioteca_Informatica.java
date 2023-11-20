package tipagem;

public class Biblioteca_Informatica extends Biblioteca_Central {

        protected String livro_informatica;
        protected String editora_informatica;

        Biblioteca_Informatica (String livro_informatica, String editora_informatica){
            super(livro_informatica, editora_informatica);
            this.livro_informatica = livro_informatica;
            this.editora_informatica = editora_informatica;
        }

        public String getLivro_Informatica(){
                return livro_informatica;
        }
        public String getEditora_Informatica(){
                return editora_informatica;
        }
}
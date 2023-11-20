package tipagem;
import javax.swing.*;

public class Interface_Biblioteca {

    String m, n;

    public Biblioteca_Central livro(){

        m = JOptionPane.showInputDialog("Digite o nome do livro: ");
        n = JOptionPane.showInputDialog("Digite o nome da editora: ");
        int tipo_livro = Integer.parseInt(JOptionPane.showInputDialog("Geral = 1  \nInformática = 2  \nBiologia = 3 \nHistória = 4 \nGeografia = 5"));

        if (tipo_livro == 1)
            return new Biblioteca_Central(m, n);

        else if (tipo_livro == 2)
            return new Biblioteca_Informatica(m, n);

        else if(tipo_livro == 3)
            return new Biblioteca_Biologia(m, n);

        else if(tipo_livro == 4)
            return new Biblioteca_Historia(m, n);

        else if(tipo_livro == 5)
            return new Biblioteca_Geografia(m, n);

        else
            return null;
    }

    public void livraria(Biblioteca a){
        if (a instanceof Biblioteca_Informatica)
            System.out.println("Livro é de Informática: \n" + ((Biblioteca_Informatica)a).getLivro_Informatica() + "\n Editora:  " +
                    ((Biblioteca_Informatica)a).getLivro_Informatica());

        else if (a instanceof Biblioteca_Biologia)
            System.out.println("Livro é de biologia \n" + ((Biblioteca_Biologia)a).getLivro_Biologia() + "\n Editora:  " +
        ((Biblioteca_Biologia)a).getEditora_Biologia());

        else if (a instanceof Biblioteca_Historia)
            System.out.println("Livro é de Historia \n" + ((Biblioteca_Historia)a).getLivro_Historia() + "\n Editora:  " +
                    ((Biblioteca_Historia)a).getEditora_Historia());

        else if (a instanceof Biblioteca_Geografia)
            System.out.println("Livro é de Geografia \n" + ((Biblioteca_Geografia)a).getLivro_Geografia() + "\n Editora:  " +
                    ((Biblioteca_Geografia)a).getEditora_Geografia());

        else
            System.out.println("Livro é geral \n" + ((Biblioteca_Central)a).getLivro()+ "\n Editora: " +
                    ((Biblioteca_Central)a).getEditoralivro());
    }
}
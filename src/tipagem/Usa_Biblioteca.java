package tipagem;
public class Usa_Biblioteca {

    public static void main(String[] parametros){

        Interface_Biblioteca IB = new Interface_Biblioteca();
        Biblioteca_Central BC;
        BC = IB.livro();
        IB.livraria(BC);
    }
}
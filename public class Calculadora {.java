public class Biblioteca {
    String Titulo;
    String Autor;
    float Ano;

    Aluno (String ti, String aut,Float an) {
        System.out.println("~ novo livro adicionado - " + ti + " ~");
        Titulo = ti;
        Autor = aut;
        Ano = an;
    
        if(mostrar){
        System.out.println("Nome do livro: " + Titulo);
        System.out.println("Autor" + Autor);
        System.out.println("Ano de publicação: " + Ano);
    }
}
}
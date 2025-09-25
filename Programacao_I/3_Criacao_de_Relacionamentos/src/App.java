public class App {
    public static void main(String[] args) throws Exception {
        Autor autor1 = new Autor (01, "Paulo Freire", "Recife");
        Editora editora1 = new Editora (01, "Paz & Terra");
        TipoCapa tipoCapa1 = new TipoCapa (01, "Dourada");
        Livro livro1 = new Livro (01, "Pedagogia da Esperança", "Como ler e aprender o mundo", 93, 2025, 167, autor1, editora1, tipoCapa1);

        Autor autor2 = new Autor (02, "J.R.R. Tolkien", "Americana/SP");
        Editora editora2 = new Editora (02, "Luz e Sombra");
        TipoCapa tipoCapa2 = new TipoCapa (02, "Prateada");
        Livro livro2 = new Livro (02, "Senhor dos Anéis", "A história da Terra Média", 12, 1954, 1216, autor2, editora2, tipoCapa2);

        autor1.salvar();
        autor1.alterar();
        autor1.excluir();
        autor1.pesquisar();

        System.out.println("--------------------------------------------------");

        editora1.salvar();
        editora1.alterar();
        editora1.excluir();
        editora1.pesquisar();

        System.out.println("--------------------------------------------------");

        tipoCapa1.salvar();
        tipoCapa1.alterar();
        tipoCapa1.excluir();
        tipoCapa1.pesquisar();

        System.out.println("--------------------------------------------------");

        livro1.salvar();
        livro1.alterar();
        livro1.excluir();
        livro1.pesquisar();

        System.out.println("--------------------------------------------------");

        livro2.salvar();
        livro2.alterar();
        livro2.excluir();
        livro2.pesquisar();
    }
}

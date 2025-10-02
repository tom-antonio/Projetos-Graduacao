public class Livro extends ClasseGenerica {
    private String resenha;
    private int edicao;
    private int ano_publicacao;
    private int n_paginas;
    private Autor autor;
    private Editora editora;
    private TipoCapa tipoCapa;

    public Livro() {
    }
    public Livro(int id, String nome, String resenha, int edicao, int ano_publicacao, int n_paginas, Autor autor, Editora editora, TipoCapa tipoCapa){
        super(id, nome);
        this.resenha = resenha;
        this.edicao = edicao;
        this.ano_publicacao = ano_publicacao;
        this.n_paginas = n_paginas;
        this.autor = autor;
        this.editora = editora;
        this.tipoCapa = tipoCapa;
    }
    public String getResenha() {
        return resenha;
    }
    public void setResenha(String resenha) {
        this.resenha = resenha;
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public int getAno_publicacao() {
        return ano_publicacao;
    }
    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }
    public int getN_paginas() {
        return n_paginas;
    }
    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Editora getEditora() {
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public TipoCapa getTipoCapa() {
        return tipoCapa;
    }
    public void setTipoCapa(TipoCapa tipoCapa) {
        this.tipoCapa = tipoCapa;
    }
}

public class Categoria {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Categoria() {
    }
    public Categoria(String descricao) {
        this.descricao = descricao;
    }

    public void Salvar() {
        System.out.println("Salvo com sucesso!");
    }
    public void Alterar() {
        System.out.println("Alterado com sucesso!");
    }
    public void Excluir() {
        System.out.println("Excluído com sucesso!");
    }
    public void Pesquisar() {
        System.out.println("Pesquisado com sucesso!");
    }
}
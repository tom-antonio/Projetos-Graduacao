public class Garagem {
    private String nome;
    private String cidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Garagem() {
    }
    public Garagem(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
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
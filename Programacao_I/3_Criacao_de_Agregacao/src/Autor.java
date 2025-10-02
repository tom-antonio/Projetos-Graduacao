public class Autor {
    private int id;
    private String nome;
    private String cidade;

    public Autor () {
    }
    public Autor (int id, String nome, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
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

    public void salvar(){
        System.out.println("Você salvou o autor "+ this.nome);
    }
    public void alterar(){
        System.out.println("Você alterou o autor "+ this.nome);
    }
    public void excluir(){
        System.out.println("Você excluiu o autor "+ this.nome);
    }
    public void pesquisar(){
        System.out.println("Você pesquisou o autor "+ this.nome);
    }
}

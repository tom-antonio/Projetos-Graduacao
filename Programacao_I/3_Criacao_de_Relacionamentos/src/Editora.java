public class Editora {
    private int id;
    private String nome;

    public Editora() {
    }
    public Editora(int id, String nome) {
        this.id = id;
        this.nome = nome;
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
    public void salvar(){
        System.out.println("Você salvou a editora "+ this.nome);
    }
    public void alterar(){
        System.out.println("Você alterou a editora "+ this.nome);
    }
    public void excluir(){
        System.out.println("Você excluiu a editora "+ this.nome);
    }
    public void pesquisar(){
        System.out.println("Você pesquisou a editora "+ this.nome);
    }
}

public class Responsavel {
    private int id;
    private String nome;

    public Responsavel() {
    }

    public Responsavel(int id, String nome) {
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

    public void salvarResponsavel() {
        System.out.println("Salvando responsavel: ID=" + this.id + ", Descrição=" + this.nome);
    }
    public void alterarResponsavel() {
        System.out.println("Alterando responsavel: ID=" + this.id + ", Descrição=" + this.nome);
    }
    public void excluirResponsavel() {
        System.out.println("Excluindo responsavel: ID=" + this.id + ", Descrição=" + this.nome);
    }
    public void pesquisarResponsavel() {
        System.out.println("Pesquisando responsavel: ID=" + this.id + ", Descrição=" + this.nome);
    }
}

public class Autor extends ClasseGenerica {
    private String cidade;

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Autor(String cidade) {
        this.cidade = cidade;
    }
    public Autor(int id, String nome, String cidade) {
        super(id, nome);
        this.cidade = cidade;
    }
    @Override
    public void salvar() {
        System.out.println("Registro salvo com sucesso na classe Autor");
        super.salvar();
    }
    
}

public class Autor extends ClasseGenerica {
    private String cidade;

    public Autor() {
    }

    public Autor(int id, String nome, String cidade) {
        super(id, nome);
        this.cidade = cidade;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public void salvar() {
        System.out.println("Autor salvo com sucesso");
    }

    public void alterar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    public void excluir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }

    public void pesquisar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisar'");
    }

}

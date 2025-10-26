
public class Veiculo {
    private String nome;
    private int ano;
    private int modelo;
    private String cor;
    private String placa;
    private boolean unico_dono;
    private Categoria categoria;
    private Garagem garagem;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public boolean isUnico_dono() {
        return unico_dono;
    }
    public void setUnico_dono(boolean unico_dono) {
        this.unico_dono = unico_dono;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Garagem getGaragem() {
        return garagem;
    }
    public void setGaragem(Garagem garagem) {
        this.garagem = garagem;
    }
    public Veiculo() {
    }
    public Veiculo(String nome, int ano, int modelo, String cor, String placa, boolean unico_dono, Categoria categoria,
            Garagem garagem) {
        this.nome = nome;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.unico_dono = unico_dono;
        this.categoria = categoria;
        this.garagem = garagem;
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
    public void setModelo(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setModelo'");
    }
    public void setFabricante(Fabricante f1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFabricante'");
    }
    public void ImprimirVeiculo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ImprimirVeiculo'");
    }
    public void setName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}

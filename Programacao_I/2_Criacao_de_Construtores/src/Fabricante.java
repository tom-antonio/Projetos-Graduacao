public class Fabricante {
    private int id;
    private String nome;
    private String cnpj;
    private String cidade;

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
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Fabricante() {
    }
    public Fabricante(int id, String nome, String cnpj, String cidade) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.cidade = cidade;
    }

//Construtor serve para inicializar os atributos da classe, construir o objeto.
//Se tiver um construutor com parametros, o construtor padrão (sem parâmetros) necessariamente é obrigatório existir.


    
}

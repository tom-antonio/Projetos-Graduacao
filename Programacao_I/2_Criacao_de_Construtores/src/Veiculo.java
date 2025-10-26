public class Veiculo {
    private int id;
    private String placa;
    private String name;
    private int ano;
    private String modelo;
    private Fabricante fabricante;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public void ImprimirVeiculo (){
        System.out.println("###  Dados do Veículo  ###");
        System.out.println("Placa: " + this.getPlaca());
        System.out.println("Nome: " + this.getName());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Nome: " + this.getFabricante().getNome());
        System.out.println("CNPJ: " + this.getFabricante().getCnpj());
        System.out.println("Cidade: " + this.getFabricante().getCidade());
        System.out.println("\n");
    }
}

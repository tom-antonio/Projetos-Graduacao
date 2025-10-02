public class Motos extends Veiculo {
    private int cilindradas;

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    public Motos() {
    }
    public Motos(String nome, int ano, int modelo, String cor, String placa, boolean unico_dono, Categoria categoria,
            Garagem garagem, int cilindradas) {
        super(nome, ano, modelo, cor, placa, unico_dono, categoria, garagem);
        this.cilindradas = cilindradas;
    }
    @Override
    public void Salvar() {
        System.out.println("Você salvou");
        super.Salvar();
    }
}

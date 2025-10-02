public class Carros extends Veiculo {
    private int motorizacao_cv;
    private int qtde_marcha;
    private String opcionais;

    public int getMotorizacao_cv() {
        return motorizacao_cv;
    }
    public void setMotorizacao_cv(int motorizacao_cv) {
        this.motorizacao_cv = motorizacao_cv;
    }
    public int getQtde_marcha() {
        return qtde_marcha;
    }
    public void setQtde_marcha(int qtde_marcha) {
        this.qtde_marcha = qtde_marcha;
    }
    public String getOpcionais() {
        return opcionais;
    }
    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }
    public Carros() {
    }
    public Carros(String nome, int ano, int modelo, String cor, String placa, boolean unico_dono, Categoria categoria,
            Garagem garagem, int motorizacao_cv, int qtde_marcha, String opcionais) {
        super(nome, ano, modelo, cor, placa, unico_dono, categoria, garagem);
        this.motorizacao_cv = motorizacao_cv;
        this.qtde_marcha = qtde_marcha;
        this.opcionais = opcionais;
    }
    @Override
    public void Salvar() {
        super.Salvar();
    }
}

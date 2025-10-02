public class Main {
    public static void main(String[] args) {
        Garagem garagem = new Garagem("Moto Mais", "São Paulo");
        Categoria categoria = new Categoria("Conversíveis");
        Motos moto = new Motos("Biz 2010", 2010, 2010, "Azul", "ABC-1234", true, categoria, garagem, 1000);
        Carros carro = new Carros("Celta 2010", 2010, 2010, "Prata", "XYZ-5678", true, categoria, garagem, 80, 5, "Ar Condicionado");
        Veiculo veiculo = new Veiculo("Fusca 1970", 1970, 1970, "Amarelo", "DEF-4321", false, categoria, garagem);

        moto.Salvar();
        moto.Excluir();
        moto.Alterar();
        moto.Pesquisar();

        carro.Salvar();
        carro.Excluir();
        carro.Alterar();
        carro.Pesquisar();

        veiculo.Salvar();
        veiculo.Excluir();
        veiculo.Alterar();
        veiculo.Pesquisar();

        garagem.Salvar();
        garagem.Excluir();
        garagem.Alterar();
        garagem.Pesquisar();

        categoria.Salvar();
        categoria.Excluir();
        categoria.Alterar();
        categoria.Pesquisar();
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Fabricante f1 = new Fabricante();
        f1.setId(01);
        f1.setNome("Chevrolet");
        f1.setCnpj("12.720.369/0001-72");
        f1.setCidade("São Paulo");

        Veiculo v1 = new Veiculo();
        v1.setId(01);
        v1.setPlaca("NFH-2314");
        v1.setName("Corsa");
        v1.setAno(2006);
        v1.setModelo("Duas portas");
        v1.setFabricante(f1);

        Veiculo v2 = new Veiculo();
        v2.setId(02);
        v2.setPlaca("NGK-5948");
        v2.setName("S10");
        v2.setAno(2012);
        v2.setModelo("Rodeio");
        v2.setFabricante(f1);

    v1.ImprimirVeiculo();
    v2.ImprimirVeiculo();
    
    }
}

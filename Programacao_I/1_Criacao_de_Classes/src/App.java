import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();
        produto1.setNome("Macarrão");
        produto1.setMarca("Renata");
        produto1.setPreco(5.99);
        produto1.setQtde(20);

        Produto produto2 = new Produto();
        produto2.setNome("Extrato Tomate");
        produto2.setMarca("Elefante");
        produto2.setPreco(3.99);
        produto2.setQtde(10);

        Venda venda = new Venda();
        venda.setNumeroVenda("123456");
        venda.setProduto(produto2);
        venda.setData(LocalDate.now());

        venda.ImprimirVenda();
    }

    
}
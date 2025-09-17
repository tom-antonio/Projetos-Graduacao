public class App {
    public static void main(String[] args) throws Exception {
        Produto prod = new Produto();
        prod.setNome("Fita Isolante");
        prod.setMarca("3M");
        prod.setPreco(3.50);
        prod.setQtde(10);
     
        System.out.println("Nome: " + prod.getNome());
        System.out.println("Marca: " + prod.getMarca());
        System.out.println("Preço: " + prod.getPreco());
        System.out.println("Quantidade: " + prod.getQtde());
        System.out.println("Total: " + (prod.getPreco() * prod.getQtde()));
    }
}

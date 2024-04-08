import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto p1 = new Produto("Arroz", 26.90, 3);
        Produto p2 = new Produto("Feijão", 8.99, 3);

        listaProdutos.add(p1);
        listaProdutos.add(p2);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

        for (Produto produto : listaProdutos) {
            System.out.println(produto);

            Produto produtoNovo = new Produto("Novo Produto", 15.99, 3);
            System.out.println(produtoNovo);

            ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2023-12-31");
            System.out.println(produtoPerecivel);



        }
    }
}
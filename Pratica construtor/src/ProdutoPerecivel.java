public class ProdutoPerecivel extends Produto{

    String dataValidade;

    public ProdutoPerecivel(String nome, double preço, int quantidade, String dataValidade) {
        super(nome, preço, quantidade);
        this.dataValidade = dataValidade;
    }
}

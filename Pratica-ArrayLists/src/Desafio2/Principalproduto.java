package Desafio2;

import java.util.ArrayList;

public class Principalproduto {
    public static void main(String[] args) {

        Produto p1 = new Produto("arroz", 3.33);
        Produto p2 = new Produto("feijão", 5.55);
        Produto p3 = new Produto("Batata", 2.99);


        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos){
            somaPrecos += produto.getPreco();
        }
        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);

    }
}

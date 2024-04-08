package segundoETerceiro;

public class Titulo implements Comparable<Titulo> {
    public String nome;

    public Titulo(String d) {
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}

public class TelaAvaliacao {

    private String estabelecimento;

    private String itens;

    private int notas;

    private String comentario;

    public TelaAvaliacao(String estabelecimento, String itens, int notas, String comentario) {
        this.estabelecimento = estabelecimento;
        this.itens = itens;
        this.notas = notas;
        this.comentario = comentario;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

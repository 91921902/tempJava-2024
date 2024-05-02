public class Loja {

    private String nome;

    private String cor;

    private int numeroSapato;

    public Loja(String nome, String cor, int numeroSapato) {
        this.nome = nome;
        this.cor = cor;
        this.numeroSapato = numeroSapato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroSapato() {
        return numeroSapato;
    }

    public void setNumeroSapato(int numeroSapato) {
        this.numeroSapato = numeroSapato;
    }
}

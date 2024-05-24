public class Pessoa {
    private String nome;
    private int id;
    private String senha;


    public Pessoa(String nome, int id, String senha) { /*construtor= botão direito > generete*/
        this.nome = nome;
        this.id = id;
        this.senha = senha;
    }

    public void mudarSenha(String senha) {
        this.setSenha(senha);
    }

    public String getNome() { /* get end set = botão direiro> generte*/
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

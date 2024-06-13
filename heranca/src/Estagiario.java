public class Estagiario extends Aluno{

    private String estagio;

    public Estagiario(String nome, int id, String senha, String curso, String estagio) {
        super(nome, id, senha, curso);
        this.estagio = estagio;
    }


    public void estagiando(){
        System.out.println("Vou começar meu estagio hoje");
    }

    public String getEstagio() {
        return estagio;
    }

    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }
}

public class Leao extends Animal {

    private String juba;



    public Leao(String nome, int idade, String habitat, String juba) {
        super(nome, idade, habitat);

        this.juba = juba;
    }

    public String getJuba() {
        return juba;
    }

    public void setJuba(String juba) {
        this.juba = juba;
    }


    public void emitirSom() {
        System.out.println("Leão rugindo");
    }


}

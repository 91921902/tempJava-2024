public class Elefante extends Animal {

    private String tromba;


    public Elefante(String nome, int idade, String habitat, String tromba) {
        super(nome, idade, habitat);
        this.tromba=tromba;

    }

    public String getTromba() {
        return tromba;
    }

    public void setTromba(String tromba) {
        this.tromba = tromba;
    }
    public void emitirSom() {
        System.out.println("Barulho de trombeta");
    }
}


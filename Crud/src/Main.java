import javax.swing.*;

public class Main {
    public static void main(String[] args){
        TelaHomeCrud t = new TelaHomeCrud();
        t.setContentPane(t.painel);
        t.setTitle("CRUD");
        t.setSize(400, 400);
        t.setVisible(true);
        t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
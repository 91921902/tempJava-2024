import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaHome t = new TelaHome();
        t.setContentPane(t.painelPrincipal);
        t.setTitle("AvaliandoPratos");
        t.setSize(400, 400);
        t.setVisible(true);
        t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
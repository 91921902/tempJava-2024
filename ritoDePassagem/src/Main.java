import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        for(int i =0; i<3; i++){
            String nome =
                    JOptionPane.showInputDialog("Digite o nome da pessoa"+(i+1));
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
            Pessoa p = new Pessoa (nome, idade);

        }
    }
}
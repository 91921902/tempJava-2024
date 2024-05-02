import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;

public class TelaHomeCrud extends JFrame {
    public JPanel painel;

    private JTextField txtNome;
    private JLabel Nome;
    private JTextField txtNumero;
    private JLabel Numero;
    private JTextField txtCor;
    private JLabel Cor;
    private JButton btCadastrar;
    private JButton btMostrar;
    private JButton btLocalizar;
    private JButton btEditar;
    private JButton btApagar;
    private JButton btFakes;

    static ArrayList <Loja> sapatos = new ArrayList <Loja>();/*cria o vetor*/

    public TelaHomeCrud() {


        btCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Loja l = new Loja (txtNome.getText(),txtCor.getText(), Integer.parseInt(txtNumero.getText()));

                System.out.println(l.getNome()); /*mostra no terminal*/
                System.out.println(l.getCor());
                System.out.println(l.getNumeroSapato());

                sapatos.add(l); /*coloca no vetor as infomações*/
            }
        });
        btLocalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });
        btEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btFakes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JTextArea txtRegistro;

    static ArrayList<Loja> sapatos = new ArrayList<>(); /*cria o vetor*/

    public TelaHomeCrud() {
        btCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtNome.getText().isEmpty() && !txtCor.getText().isEmpty() && !txtNumero.getText().isEmpty()) {
                    Loja l = new Loja(txtNome.getText(), txtCor.getText(), Integer.parseInt(txtNumero.getText()));
                    sapatos.add(l); /*coloca no vetor as informações*/

                    /* Limpa os campos de texto para os próximos cadastros */
                    txtNome.setText("");
                    txtCor.setText("");
                    txtNumero.setText("");

                    JOptionPane.showMessageDialog(null, "Sapato cadastrado com sucesso!");
                    atualizarRegistro(); // Atualiza o registro
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                }
            }
        });

        btLocalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeParaLocalizar = JOptionPane.showInputDialog("Digite o nome do sapato a ser localizado:");
                boolean encontrado = false; /*ja começa dizendo que não tem um nome a localizar ainda*/
                for (Loja sapato : sapatos) {
                    if (sapato.getNome().equalsIgnoreCase(nomeParaLocalizar)) {
                        JOptionPane.showMessageDialog(null, "Sapato encontrado: \nNome: " + sapato.getNome() + "\nCor: " + sapato.getCor() + "\nNúmero: " + sapato.getNumeroSapato());
                        encontrado = true; /*se ouver nome troca para verdadeiro*/
                        break;
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Sapato não encontrado.");
                }
            }
        });

        btEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeParaEditar = JOptionPane.showInputDialog("Digite o nome do sapato a ser editado:");
                boolean encontrado = false;

                for (Loja sapato : sapatos) {

                    /*equalsIgnoreCase poderá ser digitado maiúsculo ou minúsculo*/

                    if (sapato.getNome().equalsIgnoreCase(nomeParaEditar)) {
                        /* caso sapato encontrado:*/
                        String novoNome = JOptionPane.showInputDialog("Digite o novo nome:");
                        String novaCor = JOptionPane.showInputDialog("Digite a nova cor:");
                        int novoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo número do sapato:"));

                        sapato.setNome(novoNome);
                        sapato.setCor(novaCor);
                        sapato.setNumeroSapato(novoNumero);

                        JOptionPane.showMessageDialog(null, "Sapato editado com sucesso.");
                        encontrado = true;
                        atualizarRegistro(); // Atualiza o registro
                        break;
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Sapato não encontrado.");
                }
            }
        });

        btApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeParaApagar = JOptionPane.showInputDialog("Digite o nome do sapato a ser apagado:");
                boolean encontrado = false;

                for (Loja sapato : sapatos) {
                    if (sapato.getNome().equalsIgnoreCase(nomeParaApagar)) {
                        sapatos.remove(sapato);
                        JOptionPane.showMessageDialog(null, "Sapato apagado com sucesso.");
                        encontrado = true;
                        atualizarRegistro(); // Atualiza o registro
                        break;
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Sapato não encontrado.");
                }
            }
        });

        btMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarRegistro(); // Atualiza o registro
            }

        });

        btFakes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sapatos.add(new Loja("Sapato A", "Azul", 38));
                sapatos.add(new Loja("Sapato B", "Preto", 42));
                sapatos.add(new Loja("Sapato C", "Vermelho", 36));

                JOptionPane.showMessageDialog(null, "Cadastros falsos adicionados com sucesso!");
                atualizarRegistro(); // Atualiza o registro
            }
        });
    }

    private void atualizarRegistro() {
        if (sapatos.isEmpty()) {
            txtRegistro.setText("Nenhum sapato cadastrado.");
        } else {
            StringBuilder mensagem = new StringBuilder();
            mensagem.append("Lista de sapatos cadastrados:\n\n");

            for (Loja sapato : sapatos) {
                mensagem.append("Nome: ").append(sapato.getNome()).append("\n");
                mensagem.append("Cor: ").append(sapato.getCor()).append("\n");
                mensagem.append("Número: ").append(sapato.getNumeroSapato()).append("\n\n");
            }

            txtRegistro.setText(mensagem.toString());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new TelaHomeCrud();
        frame.setContentPane(new TelaHomeCrud().painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

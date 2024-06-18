import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaHome extends JFrame {
    public JPanel painelPrincipal;
    private JTextField txtEstabelecimento;
    private JTextField txtItens;
    private JTextField txtNota;
    private JTextField txtComentario;
    private JButton btnGuardar;
    private JButton btnBuscar;
    private JButton btnBuscarItem;
    private JButton btnMostrar;
    private JButton btnFake;
    private JScrollPane scrollPane;
    private JTextArea textAreaAvaliacoes;

    static ArrayList<TelaAvaliacao> avaliacao = new ArrayList<>();

    public TelaHome() {
        textAreaAvaliacoes = new JTextArea();
        textAreaAvaliacoes.setEditable(false); // Para tornar o JTextArea somente leitura
        scrollPane.setViewportView(textAreaAvaliacoes);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtEstabelecimento.getText().isEmpty() && !txtItens.getText().isEmpty() && !txtNota.getText().isEmpty() && !txtComentario.getText().isEmpty()) {
                    TelaAvaliacao a = new TelaAvaliacao(txtEstabelecimento.getText(), txtItens.getText(), Integer.parseInt(txtNota.getText()), txtComentario.getText());
                    avaliacao.add(a); /* coloca no vetor as informações */


                    JOptionPane.showMessageDialog(null, "Avaliação cadastrada com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

                    txtEstabelecimento.setText("");
                    txtItens.setText("");
                    txtNota.setText("");
                    txtComentario.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.", "Erro no Cadastro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String estabelecimentoBusca = txtEstabelecimento.getText();
                if (!estabelecimentoBusca.isEmpty()) {
                    boolean encontrou = false;
                    String resultado = "";
                    for (TelaAvaliacao aval : avaliacao) {
                        if (aval.getEstabelecimento().equalsIgnoreCase(estabelecimentoBusca)) {
                            encontrou = true;
                            resultado += "Estabelecimento encontrado:\n";
                            resultado += "Estabelecimento: " + aval.getEstabelecimento() + "\n";
                            resultado += "Itens: " + aval.getItens() + "\n";
                            resultado += "Comentário: " + aval.getComentario() + "\n";
                            resultado += "Nota: " + aval.getNotas() + "\n\n";
                        }
                    }
                    if (encontrou) {
                        JOptionPane.showMessageDialog(null, resultado, "Busca de Estabelecimento", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Estabelecimento não encontrado.", "Busca de Estabelecimento", JOptionPane.WARNING_MESSAGE);
                    }
                    txtEstabelecimento.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira o nome do estabelecimento para buscar.", "Busca de Estabelecimento", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBuscarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itemBusca = txtItens.getText();
                if (!itemBusca.isEmpty()) {
                    boolean encontrou = false;
                    String resultado = "";
                    for (TelaAvaliacao aval : avaliacao) {
                        if (aval.getItens().equalsIgnoreCase(itemBusca)) {
                            encontrou = true;
                            resultado += "Item encontrado:\n";
                            resultado += "Estabelecimento: " + aval.getEstabelecimento() + "\n";
                            resultado += "Itens: " + aval.getItens() + "\n";
                            resultado += "Comentário: " + aval.getComentario() + "\n";
                            resultado += "Nota: " + aval.getNotas() + "\n\n";
                        }
                    }
                    if (encontrou) {
                        JOptionPane.showMessageDialog(null, resultado, "Busca de Item", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Item não encontrado.", "Busca de Item", JOptionPane.WARNING_MESSAGE);
                    }
                    txtItens.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira o nome do item para buscar.", "Busca de Item", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnFake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TelaAvaliacao a1 = new TelaAvaliacao("Restaurante A", "Pizza", 10, "Ótima pizza!");
                TelaAvaliacao a2 = new TelaAvaliacao("Cafeteria B", "Café", 8, "Bom café, ambiente agradável.");
                TelaAvaliacao a3 = new TelaAvaliacao("Lanchonete C", "Hambúrguer", 3, "Hambúrguer mediano, mas atendimento bom.");
                TelaAvaliacao a4 = new TelaAvaliacao("Restaurante D", "Sushi", 10, "Sushi delicioso, melhor da cidade.");
                TelaAvaliacao a5 = new TelaAvaliacao("Padaria E", "Pão", 10, "Pão fresquinho e saboroso.");


                avaliacao.add(a1);
                avaliacao.add(a2);
                avaliacao.add(a3);
                avaliacao.add(a4);
                avaliacao.add(a5);


                JOptionPane.showMessageDialog(null, "Avaliações fake adicionadas com sucesso!", "Avaliações Fake", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                atualizarTextAreaAvaliacoes();
            }
        });
    }

    private void atualizarTextAreaAvaliacoes() {
        StringBuilder conteudo = new StringBuilder();
        for (TelaAvaliacao aval : avaliacao) {
            conteudo.append("Estabelecimento: ").append(aval.getEstabelecimento()).append("\n");
            conteudo.append("Itens: ").append(aval.getItens()).append("\n");
            conteudo.append("Nota: ").append(aval.getNotas()).append("\n");
            conteudo.append("Comentário: ").append(aval.getComentario()).append("\n\n");
        }
        textAreaAvaliacoes.setText(conteudo.toString());
    }

}
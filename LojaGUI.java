/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LojaGUI extends JFrame {
    private final JLabel labelNome;
    private final JLabel labelQuantidade;
    private JTextField textFieldNome;
    private JTextField textFieldQuantidade;
    private final JButton buttonAdicionar;
    private final JButton buttonDeletar;
    private final JButton buttonEditar;
    private final JButton buttonPesquisar;
    private final Estoque estoque;

    public LojaGUI() {
        estoque = new Estoque();
        
        setTitle("Loja");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelNome = new JLabel("Nome:");
        labelQuantidade = new JLabel("Quantidade:");
        textFieldNome = new JTextField(20);
        textFieldQuantidade = new JTextField(5);
        buttonAdicionar = new JButton("Adicionar");
        buttonDeletar = new JButton("Deletar");
        buttonEditar = new JButton("Editar");
        buttonPesquisar = new JButton("Pesquisar");

        JPanel panel = new JPanel();
        panel.add(labelNome);
        panel.add(textFieldNome);
        panel.add(labelQuantidade);
        panel.add(textFieldQuantidade);
        panel.add(buttonAdicionar);
        panel.add(buttonDeletar);
        panel.add(buttonEditar);
        panel.add(buttonPesquisar);

        add(panel, BorderLayout.CENTER);

        buttonAdicionar.addActionListener((ActionEvent e) -> {
            String nome = textFieldNome.getText();
            int quantidade = Integer.parseInt(textFieldQuantidade.getText());
            adicionarProduto(nome, quantidade);
        });

        buttonDeletar.addActionListener((ActionEvent e) -> {
            String nome = textFieldNome.getText();
            deletarProduto(nome);
        });

        buttonEditar.addActionListener((ActionEvent e) -> {
            String nome = textFieldNome.getText();
            int quantidade = Integer.parseInt(textFieldQuantidade.getText());
            editarProduto(nome, quantidade);
        });

        buttonPesquisar.addActionListener((ActionEvent e) -> {
            String nome = textFieldNome.getText();
            pesquisarProduto(nome);
        });
    }

    public void adicionarProduto(String nome, int quantidade) {
        estoque.adicionarProduto(nome, quantidade);
        JOptionPane.showMessageDialog(this, "Produto adicionado ao estoque: " + nome);
    }

    public void deletarProduto(String nome) {
        estoque.deletarProduto(nome);
        JOptionPane.showMessageDialog(this, "Produto removido do estoque: " + nome);
    }

    public void editarProduto(String nome, int quantidade) {
        estoque.editarProduto(nome, quantidade);
        JOptionPane.showMessageDialog(this, "Quantidade do produto atualizada: " + nome);
    }

    public void pesquisarProduto(String nome) {
        int quantidade = estoque.quantidadeProduto(nome);
        if (quantidade > 0) {
            JOptionPane.showMessageDialog(this, "Produto encontrado no estoque: " + nome);
        } else {
            JOptionPane.showMessageDialog(this, "Produto não encontrado no estoque: " + nome);
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new LojaGUI().setVisible(true);
        });
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;
import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private final Map<String, Integer> produtos;
    
    public Estoque() {
        produtos = new HashMap<>();
    }
    
    public void adicionarProduto(String nome, int quantidade) {
        if (produtos.containsKey(nome)) {
            int quantidadeAtual = produtos.get(nome);
            quantidade += quantidadeAtual;
        }
        produtos.put(nome, quantidade);
    }
    
    public void deletarProduto(String nome) {
        produtos.remove(nome);
    }
    
    public void editarProduto(String nome, int quantidade) {
        produtos.put(nome, quantidade);
    }
    
    public int quantidadeProduto(String nome) {
        return produtos.getOrDefault(nome, 0);
    }
}


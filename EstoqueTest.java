/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EstoqueTest {
    
    @Test
    public void testAdicionarProduto() {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto("Camiseta", 10);
        assertEquals(10, estoque.quantidadeProduto("Camiseta"));
    }
    
    @Test
    public void testDeletarProduto() {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto("Camiseta", 10);
        estoque.deletarProduto("Camiseta");
        assertEquals(0, estoque.quantidadeProduto("Camiseta"));
    }
    
    @Test
    public void testEditarProduto() {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto("Camiseta", 10);
        estoque.editarProduto("Camiseta", 5);
        assertEquals(5, estoque.quantidadeProduto("Camiseta"));
    }
    
    @Test
    public void testPesquisarProduto() {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto("Camiseta", 10);
        int quantidade = estoque.quantidadeProduto("Camiseta");
        assertEquals(10, quantidade);
    }
}
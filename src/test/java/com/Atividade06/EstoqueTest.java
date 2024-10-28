package com.Atividade06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

class EstoqueTest {
    private Estoque estoque;
    private Produto produto1;
    private Produto produto2;

    @BeforeEach
    void setUp() {
        estoque = new Estoque();
        produto1 = new Produto("Produto A", 10.0);
        produto2 = new Produto("Produto B", 20.0);
    }

    @Test
    void testAdicionarProduto() {
        assertTrue(estoque.adicionarProduto(produto1));
        assertFalse(estoque.adicionarProduto(produto1)); 
    }

    @Test
    void testRemoverProduto() {
        estoque.adicionarProduto(produto1);
        assertTrue(estoque.removerProduto("Produto A"));
        assertFalse(estoque.removerProduto("Produto A")); 
    }

    @Test
    void testBuscarProdutoExistente() {
        estoque.adicionarProduto(produto1);
        assertEquals(produto1, estoque.buscarProduto("Produto A"));
    }

    @Test
    void testBuscarProdutoNaoExistente() {
        assertNull(estoque.buscarProduto("Produto X"));
    }

    @Test
    void testListarProdutos() {
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        Set<Produto> produtos = estoque.listarProdutos();
        assertEquals(2, produtos.size());
        assertTrue(produtos.contains(produto1));
        assertTrue(produtos.contains(produto2));
    }
}


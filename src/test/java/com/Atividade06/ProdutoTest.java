package com.Atividade06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    
    void testCriarProduto() {
        Produto produto = new Produto("Produto A", 10.0);
        assertEquals("Produto A", produto.getNome());
        assertEquals(10.0, produto.getPreco());
    }

    @Test
    void testEquals() {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto A", 15.0);
        Produto produto3 = new Produto("Produto B", 20.0);
        
        assertEquals(produto1, produto2);
        assertNotEquals(produto1, produto3); 
    }

    @Test
    void testHashCode() {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto A", 15.0);
        
        assertEquals(produto1.hashCode(), produto2.hashCode()); 
    }

    @Test
    void testCompararProdutos() {
        Produto produto1 = new Produto("Produto A", 10.0);
        Produto produto2 = new Produto("Produto B", 15.0);
        
        assertTrue(produto1.compareTo(produto2) < 0); 
    }
}

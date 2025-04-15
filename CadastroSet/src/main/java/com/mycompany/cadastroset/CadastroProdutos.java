/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Leo
 */
public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet();
    }
    
    public void adicionarProduto(String nome, long cod, double price, int quantity){
        produtos.add(new Produto(nome, cod, price, quantity));
    }
    
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }
    
    public Set<Produto> produtosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ProdutosPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }
}

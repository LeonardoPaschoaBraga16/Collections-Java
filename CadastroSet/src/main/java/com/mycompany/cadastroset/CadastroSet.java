/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastroset;

/**
 *
 * @author Leo
 */
public class CadastroSet {

    public static void main(String[] args) {
        CadastroProdutos c1 = new CadastroProdutos();
        
        c1.adicionarProduto("Chocolate", 237, 6.99, 99);
        c1.adicionarProduto("Sabao em Po", 559, 12.30, 60);
        
        System.out.println(c1.exibirProdutosPorNome());
        System.out.println(c1.produtosPorPreco());
    }
}

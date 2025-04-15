/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livrariaonline;

/**
 *
 * @author Leo
 */
public class LivrariaOnline {

    public static void main(String[] args) {
        Livraria livralo = new Livraria();
        
        livralo.adicionarLivro("http:Amazon.LivroLegal", "Livro Legal", "Autor nada legal", 120.90);
        livralo.adicionarLivro("http:Amazon.NiceCatch", "Nice Catch", "Dante Sparda", 20.99);
        livralo.adicionarLivro("http:Amazon.DevilMayCry", "Devil May Cry - Light Novel", "Dante Sparda", 50.90);
        
        System.out.println(livralo.livroAutor("Dante Sparda"));
        livralo.ordenarPreco();
        
        livralo.livroBarato();
        livralo.livroCaro();
    }
}

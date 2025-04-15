/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchlist;

/**
 *
 * @author Leo
 */
public class SearchList {

    public static void main(String[] args) {
        CatalogoLivros c1 = new CatalogoLivros();
        
        c1.adicionarLivro("Game of Thrones", "George R.R. Martin", 1998);
        c1.adicionarLivro("Duna", "Frank Herbert", 1960);
        c1.adicionarLivro("Harry Potter", "J.K Rowling", 1990);
        
        System.out.println(c1.pesquisarPorAutor("J.K Rowling"));
        System.out.println(c1.pesquisarPorIntervaloAno(1980, 2000));
        System.out.println(c1.pesquisarPorTitulo("Game of Thrones"));
    }
}

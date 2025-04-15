/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.searchlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leo
 */
public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor , anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livros.isEmpty()){
          for (Livro livro : livros){
              if(livro.getAutor().equalsIgnoreCase(autor)){
                  livrosPorAutor.add(livro);
              }
          }   
        }
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!livros.isEmpty()){
            for(Livro livro : livros){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(livro);
                }
            }
        }
        return livrosPorIntervalo;
    }
    
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livros.isEmpty()){
            for(Livro livro : livros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    
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
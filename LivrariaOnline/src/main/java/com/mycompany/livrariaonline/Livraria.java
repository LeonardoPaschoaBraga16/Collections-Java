/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livrariaonline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Leo
 */
public class Livraria {
    private Map<String, Livro> livraria;

    public Livraria() {
        this.livraria = new HashMap<>();
    }
    
    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }
    
    public void removerLivro(String titulo){
        livraria.remove(titulo);
    }
    
    public Map<String, Livro> livroAutor(String autor){
        Map<String, Livro> livroResposta = new HashMap<>();
        if(!livraria.isEmpty()){
            for(Map.Entry<String, Livro> entry : livraria.entrySet()){
                if(entry.getValue().getAutor().equals(autor)){
                    livroResposta.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return livroResposta;
    }
    
    public void livroCaro(){
       double livroPreco = Double.MIN_VALUE;
       String linkLivro = null;
       Livro livroCaro = null;
       if(!livraria.isEmpty()){
           for(Map.Entry<String, Livro> entry : livraria.entrySet()){
               if(entry.getValue().getPreco() > livroPreco){
                   livroPreco = entry.getValue().getPreco();
                   linkLivro = entry.getKey();
                   livroCaro = entry.getValue();
               }
           }
           System.out.println("O livro mais caro eh: " + livroCaro + ", O link para seu acesso eh o seguinte: " + linkLivro);
       } 
    }
    
    public void livroBarato(){
       double livroPreco = Double.MAX_VALUE;
       String linkLivro = null;
       Livro livroBarato = null;
       if(!livraria.isEmpty()){
           for(Map.Entry<String, Livro> entry : livraria.entrySet()){
               if(entry.getValue().getPreco() < livroPreco){
                   livroPreco = entry.getValue().getPreco();
                   linkLivro = entry.getKey();
                   livroBarato = entry.getValue();
               }
           }
           System.out.println("O livro mais barato eh: " + livroBarato + ", O link para seu acesso eh o seguinte: " + linkLivro);
       } 
    }
    
    public void ordenarPreco(){
        List<Map.Entry<String, Livro>> ordenados = new ArrayList<>(livraria.entrySet());
        
        ordenados.sort(Map.Entry.comparingByValue());
        
        System.out.println(ordenados);
    }
}

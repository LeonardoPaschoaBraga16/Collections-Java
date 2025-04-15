/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contatosmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leo
 */
public class AgendaContatos {
    private Map<String, Integer> listaContatos;

    public AgendaContatos() {
        this.listaContatos = new HashMap<>();
    }
    
    public void adicionarContatos(String nome, Integer numero){
        listaContatos.put(nome, numero);
    }
    
    public void removerContatos(String nome){
        if(!listaContatos.isEmpty()){
            listaContatos.remove(nome);
        } else {
            System.out.println("Lista Vazia!");
        }
    }
    
    public void exibirContatos(){
        System.out.println(listaContatos);
    }
    
    public void pesquisarPorNome(String nome){
        if(!listaContatos.isEmpty()){
            try {
              System.out.println(listaContatos.get(nome));  
            } catch(Exception e) {
                System.out.println("O contato não existe");
            }
            
        }
    }
}

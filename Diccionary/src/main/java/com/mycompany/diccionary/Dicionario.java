/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diccionary;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leo
 */
public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }
    
    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            try {
                dicionario.remove(palavra);
            } catch (Exception e){
                System.out.println("palavra não existe no dicionario");
            }
        }
    }
    
    public void exibirPalavra(){
        System.out.println(dicionario);
    }
    
    public String pesquisarPorPalavra(String palavra){
        
        if(!dicionario.isEmpty()){
            if(dicionario.containsKey(palavra)) {
                return dicionario.get(palavra);
            }
        }
        return "Palavra não encontrada";
    }
    
    
}

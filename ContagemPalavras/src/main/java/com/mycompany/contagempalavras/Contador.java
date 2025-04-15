/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contagempalavras;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leo
 */
public class Contador {
    private Map<String, Integer> contagemPalavra;

    public Contador() {
        this.contagemPalavra = new HashMap<>();
    }
    
    public void exibirContagem(){
        System.out.println(contagemPalavra);
    }

    public void adicionarPalavra(String palavra, Integer valor){
        contagemPalavra.put(palavra, valor);
    }
    
    public void removerPalavra(String valor){        
        if(!contagemPalavra.isEmpty()){
            contagemPalavra.remove(valor);
        }
    }
    
    public void palavraFrequente(){
        String palavraContagem = null;
        int presencaPalavra = Integer.MIN_VALUE;
        
        if(!contagemPalavra.isEmpty()){
            for(Map.Entry<String, Integer> entry : contagemPalavra.entrySet()){
                if (entry.getValue() > presencaPalavra){
                    palavraContagem = entry.getKey();
                    presencaPalavra = entry.getValue();
                }
            }
        }
        
        System.out.println(palavraContagem + " - " + presencaPalavra);
    }
    
    
}

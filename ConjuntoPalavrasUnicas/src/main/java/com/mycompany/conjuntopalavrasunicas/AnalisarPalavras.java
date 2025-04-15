/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conjuntopalavrasunicas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Leo
 */
public class AnalisarPalavras {
    private Set<Palavra> Palavras;

    public AnalisarPalavras() {
        this.Palavras = new HashSet<>();
    }
    
    public void AdicionarPalavras(String valor){
        Palavras.add(new Palavra(valor));
    }
    
    public void removerPalavras(String valor){
        Palavra palavraRemove = null;
        for(Palavra p : Palavras){
            if(p.getValor().equals(valor)){
                palavraRemove = p;
                break;
            }
        }
        Palavras.remove(palavraRemove);
    }
    
    public void verificarPalavra(String valor){
        Palavra palavraVerify = null;
        for(Palavra p : Palavras){
            if(p.getValor().equals(valor)){
                palavraVerify = p;
                break;
            }
        }
        if(palavraVerify != null){
            System.out.println("A palavra: " + palavraVerify + ", esta presente na lista");
        } else {
            System.out.println("A palavra nao se encontra");
        }
    }
    
    public void exibirPalavras(){
        System.out.println(Palavras);
    }
}

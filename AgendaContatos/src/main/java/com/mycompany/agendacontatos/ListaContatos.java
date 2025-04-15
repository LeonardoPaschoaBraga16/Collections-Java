/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendacontatos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Leo
 */
public class ListaContatos {
    private Set<Contato> contatos;

    public ListaContatos() {
        this.contatos = new HashSet<>();
    }
    
    public void adicionarAgenda(String nome, int contato){
        contatos.add(new Contato(nome, contato));
    }
    
    public void exibirContatos(){
        System.out.println(contatos);
    }
    
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> resultadoPorNome = new HashSet<>();
        
        for(Contato cont : contatos){
            if(cont.getNome().equals(nome)) {
                resultadoPorNome.add(cont);
            }
        }
        
        return resultadoPorNome;
    }
    
    public void atualizarNumeroContato(String nome, int novoNumero){
        
        for(Contato cont : contatos){
            if(cont.getNome().equals(nome)) {
                cont.setNumero(novoNumero);
                break;
            }
        }
    }
}

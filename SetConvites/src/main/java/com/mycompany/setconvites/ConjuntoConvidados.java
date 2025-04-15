/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.setconvites;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Leo
 */
public class ConjuntoConvidados {
    private Set<Convidado> Convidados;

    public ConjuntoConvidados() {
        this.Convidados = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codigoConvidado){
        Convidados.add(new Convidado(nome, codigoConvidado));
    }
    
    public int contarConvidados(){
        return Convidados.size();
    }
    
    public void exibirConvidados(){
        System.out.println(Convidados);
    }
    
    public void removerConvidadoPorCodConvite(int codigoConvite){
        Convidado convidadoRemocao = null;
        try{
            for(Convidado conv : Convidados){
                if(conv.getCodigoConvite() == codigoConvite){
                    convidadoRemocao = conv;
                    break;
                }
        }
        Convidados.remove(convidadoRemocao);
        System.out.println("Convidado: " + convidadoRemocao + ", removido");
        
        } catch(Exception e) {
            System.out.println("Convidado inexistente");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comparingnumbersagain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Leo
 */
public class OrdenarNumeros {
    private List<Numero> numeros;

    public OrdenarNumeros() {
        this.numeros = new ArrayList<>();
    }
    
    public void adicionrNumero(int valor){
        numeros.add(new Numero(valor));
    }
    
    public List ordemAscendente(){
        List<Numero> ordemAscendente = new ArrayList<>(numeros);
        Collections.sort(ordemAscendente);
        return ordemAscendente;
    }
    
    
    public List ordemDecrescente(){
        List<Numero> ordemDecrescente = new ArrayList<>(numeros);
        Collections.sort(ordemDecrescente, Collections.reverseOrder());
        return ordemDecrescente;
    }
    
}

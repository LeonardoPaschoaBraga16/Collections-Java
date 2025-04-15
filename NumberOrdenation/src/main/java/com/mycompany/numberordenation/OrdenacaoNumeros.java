/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberordenation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Leo
 */
public class OrdenacaoNumeros{
    private List<Numero> numbers;

    public OrdenacaoNumeros() {
        this.numbers = new ArrayList<>();
    }
    
    public void adicionarNumeros(int valor){
        numbers.add(new Numero(valor));
    } 
    
    public List<Numero> ordenarAscendente(){
        List<Numero> numerosAscendentes = new ArrayList<>(numbers);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }
    
    public List<Numero> ordenarDecrescente(){
        List<Numero> numerosAscendentes = new ArrayList<>(numbers);
        Collections.sort(numerosAscendentes, Collections.reverseOrder());
        return numerosAscendentes;
    }
}

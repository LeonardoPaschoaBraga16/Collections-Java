/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberordenation;

/**
 *
 * @author Leo
 */
public class Numero implements Comparable<Numero>{
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Numero n1) {
        return Integer.compare(this.valor, n1.valor);
    }

    @Override
    public String toString() {
        return "" + valor;
    }
    
    
}

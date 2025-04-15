/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberordenation;

/**
 *
 * @author Leo
 */
public class NumberOrdenation {

    public static void main(String[] args) {
        OrdenacaoNumeros n1 = new OrdenacaoNumeros();
        n1.adicionarNumeros(5);
        n1.adicionarNumeros(2);
        n1.adicionarNumeros(6);
        n1.adicionarNumeros(67);
        n1.adicionarNumeros(23);
        n1.adicionarNumeros(37);
        
        System.out.println(n1.ordenarAscendente());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparingnumbersagain;

/**
 *
 * @author Leo
 */
public class ComparingNumbersAgain {

    public static void main(String[] args) {
        OrdenarNumeros n1 = new OrdenarNumeros();
        n1.adicionrNumero(3);
        n1.adicionrNumero(6);
        n1.adicionrNumero(10);
        n1.adicionrNumero(4);
        n1.adicionrNumero(8);
        n1.adicionrNumero(22);
        n1.adicionrNumero(37);
        n1.adicionrNumero(60);
        n1.adicionrNumero(18);
        n1.adicionrNumero(1);
        
        System.out.println(n1.ordemAscendente());
        System.out.println(n1.ordemDecrescente());
    }
}

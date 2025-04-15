/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.setconvites;

/**
 *
 * @author Leo
 */
public class SetConvites {

    public static void main(String[] args) {
        ConjuntoConvidados c1 = new ConjuntoConvidados();
        
        c1.adicionarConvidado("Cleber", 1245);
        c1.adicionarConvidado("Joana", 23);
        c1.adicionarConvidado("Frederico", 23);
        c1.adicionarConvidado("Fernanda", 9815);
        c1.adicionarConvidado("Wanderlei", 7612);
        
        System.out.println(c1.contarConvidados());
        c1.exibirConvidados();
        c1.removerConvidadoPorCodConvite(23);
        c1.exibirConvidados();
    }
}

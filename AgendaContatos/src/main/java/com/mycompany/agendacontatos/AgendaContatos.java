/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendacontatos;

/**
 *
 * @author Leo
 */
public class AgendaContatos {

    public static void main(String[] args) {
        
        ListaContatos l1 = new ListaContatos();
        
        l1.adicionarAgenda("Felipe", 1199999999);
        l1.adicionarAgenda("Daniel", 1199999999);
        l1.adicionarAgenda("Madu", 1199999999);
        l1.adicionarAgenda("That one girl", 1199999999);
        
        l1.atualizarNumeroContato("That one girl", 1199999991);
        System.out.println(l1.pesquisarPorNome("Daniel"));
        l1.exibirContatos();
    }
}

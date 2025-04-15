/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contatosmap;

/**
 *
 * @author Leo
 */
public class ContatosMap {

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        
        agenda.adicionarContatos("Leonardo", 1149581233);
        agenda.adicionarContatos("Fulano", 114512412);
        agenda.adicionarContatos("Fulana", 114745575);
        
        agenda.removerContatos("Fulano");
        agenda.exibirContatos();
        
        agenda.pesquisarPorNome("Leonardo");
    }
}

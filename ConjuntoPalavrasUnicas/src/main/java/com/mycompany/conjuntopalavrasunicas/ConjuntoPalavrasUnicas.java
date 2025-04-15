/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conjuntopalavrasunicas;

/**
 *
 * @author Leo
 */
public class ConjuntoPalavrasUnicas {

    public static void main(String[] args) {
        AnalisarPalavras an = new AnalisarPalavras();
        
        an.AdicionarPalavras("Chainsaw Man");
        an.AdicionarPalavras("Computador");
        an.AdicionarPalavras("Folha");
        
        an.exibirPalavras();
        an.verificarPalavra("Folha");
        an.removerPalavras("Folha");
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagempalavras;

/**
 *
 * @author Leo
 */
public class ContagemPalavras {

    public static void main(String[] args) {
        Contador contagem = new Contador();
        
        contagem.adicionarPalavra("Enroladinho", 9);
        contagem.adicionarPalavra("Blocos", 2);
        contagem.adicionarPalavra("Cada", 6);
        
        contagem.exibirContagem();
        
        contagem.removerPalavra("Cada");
        contagem.exibirContagem();
        
        contagem.palavraFrequente();
    }
}

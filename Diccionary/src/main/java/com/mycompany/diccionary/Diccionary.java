/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diccionary;

/**
 *
 * @author Leo
 */
public class Diccionary {

    public static void main(String[] args) {
        Dicionario dicio = new Dicionario();
        
        dicio.adicionarPalavra("Pistache", "Eh uma comida que vem com casquinha");
        dicio.adicionarPalavra("Luva", "Tipo de vestimenta utilizada para proteger as maos");
        dicio.adicionarPalavra("Acucar", "Ingrediente que deixa alimentos e bebidos com um gosto mais doce");
        
        dicio.exibirPalavra();
        
        System.out.println(dicio.pesquisarPorPalavra("Luva"));
        System.out.println(dicio.pesquisarPorPalavra("trava"));
        dicio.removerPalavra("Luva");
        dicio.exibirPalavra();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peopleordenation;

/**
 *
 * @author Leo
 */
public class PeopleOrdenation {

    public static void main(String[] args) {
        OrdenacaoPessoa s1 = new OrdenacaoPessoa();
        
        s1.adicionarPessoa("Joao", 20, 1.85);
        s1.adicionarPessoa("Felipe", 17, 1.55);
        s1.adicionarPessoa("Julia", 14, 1.70);
        s1.adicionarPessoa("Damiao", 70, 1.95);
        s1.adicionarPessoa("Claudineia", 45, 1.65);
        
        System.out.println(s1.ordenarPorAltura());
        System.out.println(s1.ordenarPorIdade());
        
        
    }
}

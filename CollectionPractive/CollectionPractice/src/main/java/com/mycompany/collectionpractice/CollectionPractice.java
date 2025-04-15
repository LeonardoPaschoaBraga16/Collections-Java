/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collectionpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leo
 */
public class CollectionPractice {

    public static void main(String[] args) {
        Collection c1 = new Collection();
        Collection c2 = new Collection();
        Collection c3 = new Collection();
        
        c1.set(c2);
        c1.set(c3);
        
        List<Integer> listaGenerics = new ArrayList<>();
        listaGenerics.add(5);
        listaGenerics.add(12);
    }
}

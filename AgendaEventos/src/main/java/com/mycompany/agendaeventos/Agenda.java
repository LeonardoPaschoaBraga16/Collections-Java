/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendaeventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Leo
 */
public class Agenda {
    private Map<LocalDate, Evento> agenda;

    public Agenda() {
        this.agenda = new HashMap<>();
    }
    
    public void adicionarEventos(LocalDate date, String nome, String atracao){
        agenda.put(date, new Evento(nome, atracao));
    }
    
    public void exibirEventos(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(agenda);
        System.out.println(eventoTreeMap);
    }
    
    public Map<LocalDate, Evento> proximoEvento(){
        LocalDate now = LocalDate.now();
        Map<LocalDate, Evento> eventoReturn = new HashMap<>();
        if(!agenda.isEmpty()){
            for(Map.Entry<LocalDate, Evento> entry : agenda.entrySet()){
                if(entry.getKey().isAfter(now) || entry.getKey().isEqual(now) ){
                    eventoReturn.put(entry.getKey(), entry.getValue());
                    break;
                }
            }
        }
        return eventoReturn;
    }
}

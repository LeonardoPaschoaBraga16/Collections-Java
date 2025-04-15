/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendaeventos;

import java.time.LocalDate;

/**
 *
 * @author Leo
 */
public class AgendaEventos {

    public static void main(String[] args) {
        Agenda agen = new Agenda();
        
        agen.adicionarEventos(LocalDate.of(2025, 04, 20), "Evento 1", "Coisa pra fazer");
        agen.adicionarEventos(LocalDate.of(2026, 04, 20), "Evento 2", "Mesma coisa, comeback");
        agen.adicionarEventos(LocalDate.of(2018, 04, 20), "Evento 0??", "Isso existe");
        agen.adicionarEventos(LocalDate.of(2025, 04, 11), "Evento 0.5", "Preparacao");
        
        agen.exibirEventos();
        System.out.println(agen.proximoEvento());
    }
}

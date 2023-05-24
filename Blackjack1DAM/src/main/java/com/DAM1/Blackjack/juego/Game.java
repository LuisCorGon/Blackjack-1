package com.DAM1.Blackjack.juego;

import com.DAM1.Blackjack.cartas.Baraja;
import com.DAM1.Blackjack.participantes.Participante;

public class Game {
    private final Participante[] participantes;
    private Participante victorioso;
    
    public Game(Participante[] participantes) {
        //Control de la creación de los jugadores
        this.participantes = participantes;
        System.out.println("Mostrando participantes...");
        pause();
        System.out.println(this.getParticipantes());
        Baraja baraja = new Baraja();
    }

    private String getParticipantes() {
        StringBuilder sb = new StringBuilder();
        for (Participante j: participantes) {
            sb.append(j.toString());
        }
        return sb.toString();
    }
    private static void pause() {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}

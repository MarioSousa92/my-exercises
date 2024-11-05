package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Heroes.*;

import java.util.Arrays;

public class Arena {

    // Metodo para iniciar a batalha
    public void start() {
        TurnManager turnManager = new TurnManager();

        Hero[] players = {
                new Cleric(),
                new Mage(),
                new Rogue(),
                new Warrior()
        };

        // Loop até que apenas um jogador permaneça vivo
        while (players.length > 1) {
            turnManager.executeTurn(players);
            players = checkPlayersAlive(players);  // Remove jogadores derrotados
        }
        System.out.println(players[0].name + " it's the WINNER!!!");
    }

    // metodo para verificar quais jogadores ainda estão vivos
    private Hero[] checkPlayersAlive(Hero[] players) {
        return Arrays.stream(players)
                .filter(player -> player.health > 0)
                .toArray(Hero[]::new);
    }
}
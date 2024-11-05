package io.codeforall.fanstatics;

import io.codeforall.fanstatics.Heroes.Hero;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TurnManager {

    private Random random = new Random();

    public void executeTurn(Hero[] players) {

        // Armazena dano recebido por cada jogador
        int[] damageReceived = new int[players.length];

        for (int i = 0; i < players.length; i++) {
            Hero player = players[i];
            if (player.health > 0) { // Jogador ataca apenas se estiver vivo
                Hero target = selectRandomOpponent(player, players);
                if (target != null) {
                    int initialHealth = target.health;

                    boolean useAbility = random.nextBoolean();
                    if (useAbility && player.canUseAbility()) {
                        player.useAbility(target);
                    } else {
                        player.strike(target);
                    }
                    damageReceived[getIndex(players, target)] += (initialHealth - target.health);
                }
            }
        }

        // Exibe a situação de cada jogador no final da rodada
        System.out.println("\nStatus of the players after the round.");
        for (int i = 0; i < players.length; i++) {
            Hero player = players[i];
            System.out.println(player.name + " received " + damageReceived[i] + " of damage, remaining health: " + player.health);
        }
        System.out.println("-----------");
    }

    // Seleciona um adversário aleatório que não seja o próprio jogador
    private Hero selectRandomOpponent(Hero player, Hero[] players) {
        List<Hero> opponents = Arrays.stream(players)
                .filter(opponent -> opponent != player && opponent.health > 0)
                .collect(Collectors.toList());
        return opponents.isEmpty() ? null : opponents.get((int) (Math.random() * opponents.size()));
    }

    // metodo auxiliar para obter o índice de um jogador em uma lista
    private int getIndex(Hero[] players, Hero player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == player) return i;
        }
        return -1;
    }
}
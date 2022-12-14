package io.metadevs.manchkin.mechanics.duel;

import io.metadevs.manchkin.character.ManchkinCharacter;
import io.metadevs.manchkin.enemy.Effect;
import io.metadevs.manchkin.enemy.Enemy;

import java.util.List;

/**
 * битва с монстром
 */
public interface Duel {
    //TODO мб > 1
    Enemy enemy();
    //TODO мб > 1
    ManchkinCharacter manchkinCharacter();
    Status status();

    List<Effect> DuelEffects();

    /**
     * рассчет итоговой формулы
     */
    void fight();

    void invite(ManchkinCharacter manchkinCharacter);

    enum Status {
        IN_PROGRESS,
        WIN,
        LOSS,
        DRAW;
    }
}

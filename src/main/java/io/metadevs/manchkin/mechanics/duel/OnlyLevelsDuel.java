package io.metadevs.manchkin.mechanics.duel;

import io.metadevs.manchkin.character.ManchkinCharacter;
import io.metadevs.manchkin.enemy.Effect;
import io.metadevs.manchkin.enemy.Enemy;

import java.util.List;

/**
 * Дуэль учитывает только уровни, без:
 * вещей, эффектов, бонусов рас и пр.
 */
public class OnlyLevelsDuel implements Duel{

    Status status;
    final Enemy enemy;
    final ManchkinCharacter manchkinCharacter;

    public OnlyLevelsDuel(Enemy enemy, ManchkinCharacter manchkinCharacter) {
        this.enemy = enemy;
        this.manchkinCharacter = manchkinCharacter;
        this.status = Status.IN_PROGRESS;
    }

    @Override
    public Enemy enemy() {
        return enemy;
    }

    @Override
    public ManchkinCharacter manchkinCharacter() {
        return manchkinCharacter;
    }

    @Override
    public Status status() {
        return status;
    }

    @Override
    public List<Effect> DuelEffects() {
        throw new RuntimeException("this realization of duel didn't use effects ");
    }

    @Override
    public void fight() {

        if (manchkinCharacter.level() > enemy().level()){
            status = Status.WIN;
            return;
        }

        if (manchkinCharacter.level() < enemy().level()){
            status = Status.LOSS;
            return;
        }

        if (manchkinCharacter.level() == enemy().level()){
            status = Status.DRAW;
            return;
        }

    }

    @Override
    public void invite(ManchkinCharacter manchkinCharacter) {

    }
}

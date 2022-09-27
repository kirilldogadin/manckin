package io.metadevs.manchkin.mechanics.duel;

import io.metadevs.manchkin.character.ManchkinCharacter;
import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;
import io.metadevs.manchkin.enemy.BadStuff;
import io.metadevs.manchkin.enemy.Effect;
import io.metadevs.manchkin.enemy.Enemy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OnlyLevelsDuelTest {

    @Test
    void fightManchkinLevelBigger() {
        var enemy = getEnemy((short) 2);
        var manchkinCharacter = getManchkinCharacter((short) 4);
        Duel duel = new OnlyLevelsDuel(enemy, manchkinCharacter);
        duel.fight();
        Duel.Status status = duel.status();
        Assertions.assertEquals(status,Duel.Status.WIN);

    }

    @Test
    void fightEnemyLevelBigger() {
        var enemy = getEnemy((short) 4);
        var manchkinCharacter = getManchkinCharacter((short) 2);
        Duel duel = new OnlyLevelsDuel(enemy, manchkinCharacter);
        duel.fight();
        Duel.Status status = duel.status();
        Assertions.assertEquals(status,Duel.Status.LOSS);
    }

    @Test
    void fightBothLevelsEquals() {
        var enemy = getEnemy((short) 4);
        var manchkinCharacter = getManchkinCharacter((short) 4);
        Duel duel = new OnlyLevelsDuel(enemy, manchkinCharacter);
        duel.fight();
        Duel.Status status = duel.status();
        Assertions.assertEquals(status,Duel.Status.DRAW);
    }

    private Enemy getEnemy(short level) {
        return new Enemy() {
            @Override
            public String description() {
                return null;
            }

            @Override
            public Short level() {
                return level;
            }

            @Override
            public Short treasureCount() {
                return null;
            }

            @Override
            public List<Effect> effect() {
                return null;
            }

            @Override
            public List<BadStuff> badStuff() {
                return null;
            }
        };
    }

    private ManchkinCharacter getManchkinCharacter(short level) {
        return new ManchkinCharacter() {
            @Override
            public ManchkinClass manchkinClass() {
                return null;
            }

            @Override
            public Race race() {
                return null;
            }

            @Override
            public short level() {
                return level;
            }
        };
    }
}
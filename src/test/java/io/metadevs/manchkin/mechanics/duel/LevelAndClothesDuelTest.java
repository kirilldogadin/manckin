package io.metadevs.manchkin.mechanics.duel;

import io.metadevs.manchkin.character.ManchkinCharacter;
import io.metadevs.manchkin.character.Sex;
import io.metadevs.manchkin.character.SimpleManchkin;
import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;
import io.metadevs.manchkin.clothes.SimpleBody;
import io.metadevs.manchkin.clothes.SimpleHelm;
import io.metadevs.manchkin.enemy.BadStuff;
import io.metadevs.manchkin.enemy.Effect;
import io.metadevs.manchkin.enemy.Enemy;
import io.metadevs.manchkin.fake.FakeManchkinCharacter;
import io.metadevs.manchkin.fake.manclass.FakeManchkinClass;
import io.metadevs.manchkin.fake.race.FakeRace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class LevelAndClothesDuelTest {

    @Test
    void fightManchkinLevelBigger() {
        var enemy = getEnemy((short) 2);
        SimpleBody simpleBody = new SimpleBody();
        //Todo тест на Body
        simpleBody.setHelm(new SimpleHelm(
                List.of(new FakeManchkinClass()),
                List.of(new FakeRace()),
                Sex.ANY,
                (short) 1 ));
        simpleBody.helm();


        SimpleManchkin simpleManchkin = new SimpleManchkin(
                new ManchkinClass() {},
                new Race(){},
                (short) 5,
                simpleBody);
        //TODO создать body а для него надо симпл реализации шмота
        //
        simpleManchkin.body();
        simpleManchkin.level();

        Duel duel = new OnlyLevelsDuel(enemy, simpleManchkin);
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
        return new FakeManchkinCharacter(level);
    }

}
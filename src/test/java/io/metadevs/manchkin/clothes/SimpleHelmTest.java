package io.metadevs.manchkin.clothes;

import io.metadevs.manchkin.character.Sex;
import io.metadevs.manchkin.fake.manclass.FakeManchkinClass;
import io.metadevs.manchkin.fake.race.FakeRace;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleHelmTest {

    @Test
    void name() {

    }

    @Test
    void bonus() {
        Helm simpleHelm = new SimpleHelm(
                List.of(new FakeManchkinClass()),
                List.of(new FakeRace()),
                Sex.ANY,
                (short) 1);
        short bonus = simpleHelm.bonus();
        Assertions.assertEquals(bonus,1);
    }
}
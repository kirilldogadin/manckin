package io.metadevs.manchkin.clothes;

import io.metadevs.manchkin.character.Sex;
import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;

import java.util.List;

public class AbstractClothes implements Clothes {

    final List<ManchkinClass> forClass;
    final List<Race> races;
    final Sex sex;
    final short bonus;

    public AbstractClothes(List<ManchkinClass> forClass, List<Race> races, Sex sex, short bonus) {
        this.forClass = forClass;
        this.races = races;
        this.sex = sex;
        this.bonus = bonus;
    }


    @Override
    public List<ManchkinClass> forClass() {
        return forClass;
    }

    @Override
    public List<Race> forRace() {
        return races;
    }

    @Override
    public Sex forSex() {
        return sex;
    }

    @Override
    public short bonus() {
        return bonus;
    }
}

package io.metadevs.manchkin.clothes;

import io.metadevs.manchkin.character.Sex;
import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;

import java.util.List;

public class SimpleHelm extends AbstractClothes implements Helm {

    public SimpleHelm(List<ManchkinClass> forClass, List<Race> races, Sex sex, short bonus) {
        super(forClass, races, sex, bonus);
    }
}

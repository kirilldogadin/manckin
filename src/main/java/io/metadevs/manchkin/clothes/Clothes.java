package io.metadevs.manchkin.clothes;

import io.metadevs.manchkin.character.Sex;
import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;

import java.util.List;

/**
 * шмот
 */
public interface Clothes {

    List<ManchkinClass> forClass();
    List<Race> forRace();
    Sex forSex();
    short bonus();

}

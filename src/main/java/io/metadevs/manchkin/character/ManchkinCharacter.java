package io.metadevs.manchkin.character;

import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;
import io.metadevs.manchkin.clothes.InPlayBody;

public interface ManchkinCharacter {
    ManchkinClass manchkinClass();
    Race race();

    InPlayBody body();

    short level();

    Sex sex();
}

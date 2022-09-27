package io.metadevs.manchkin.character;

import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;

public interface ManchkinCharacter {
    ManchkinClass manchkinClass();
    Race race();

    short level();
}

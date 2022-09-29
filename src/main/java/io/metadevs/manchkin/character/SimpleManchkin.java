package io.metadevs.manchkin.character;

import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;
import io.metadevs.manchkin.clothes.InPlayBody;
import io.metadevs.manchkin.clothes.SimpleBody;

public class SimpleManchkin implements ManchkinCharacter{

    ManchkinClass manchkinClass;
    Race race;
    InPlayBody body;
    Short level;
    Sex sex;

    public SimpleManchkin(ManchkinClass manchkinClass, Race race, Short level) {
        this.manchkinClass = manchkinClass;
        this.race = race;
        this.level = level;

    }
    public SimpleManchkin(ManchkinClass manchkinClass, Race race, Short level, InPlayBody body) {
        this.manchkinClass = manchkinClass;
        this.race = race;
        this.level = level;
        this.body = body;
    }

    public void setManchkinClass(ManchkinClass manchkinClass) {
        this.manchkinClass = manchkinClass;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    @Override
    public ManchkinClass manchkinClass() {
        return manchkinClass;
    }

    @Override
    public Race race() {
        return race;
    }

    @Override
    public InPlayBody body() {
        return body;
    }

    @Override
    public short level() {
        return level;
    }

    @Override
    public Sex sex() {
        return sex;
    }
}

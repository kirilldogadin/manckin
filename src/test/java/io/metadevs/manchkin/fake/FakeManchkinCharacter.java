package io.metadevs.manchkin.fake;

import io.metadevs.manchkin.character.ManchkinCharacter;
import io.metadevs.manchkin.character.Sex;
import io.metadevs.manchkin.character.manclass.ManchkinClass;
import io.metadevs.manchkin.character.race.Race;
import io.metadevs.manchkin.clothes.InPlayBody;

public class FakeManchkinCharacter implements ManchkinCharacter {
        private final short level;


        public FakeManchkinCharacter(short level) {
            this.level = level;
        }

        @Override
        public ManchkinClass manchkinClass() {
            return null;
        }

        @Override
        public Race race() {
            return null;
        }

        @Override
        public InPlayBody body() {
            return null;
        }

        @Override
        public short level() {
            return level;
        }

    @Override
    public Sex sex() {
        return null;
    }
}

package io.metadevs.manchkin.enemy;

public interface Effect {

    /**
     * без знака
     * @return
     */
    Short bonus();

    /**
     * знак +-
     * @return
     */
    boolean buff();

}

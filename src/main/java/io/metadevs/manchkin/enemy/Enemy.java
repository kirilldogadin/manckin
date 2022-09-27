package io.metadevs.manchkin.enemy;

import java.util.List;

public interface Enemy {
    //TODO добавить из какой колоды + идентификатор?
    String description();

    /**
     * level
     * @return
     */
    Short level();

    /**
     * кол-во сокровищ
     * @return
     */
    Short treasureCount();

    /**
     * бафы и дебафы против классов и рас
     * @return
     */
    List<Effect> effect();

    /**
     * действие в случае проигрыша
     * @return
     */
    List<BadStuff> badStuff();
}

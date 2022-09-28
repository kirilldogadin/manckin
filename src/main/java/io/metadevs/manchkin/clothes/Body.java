package io.metadevs.manchkin.clothes;

import java.util.List;

public class Body implements InPlayBody{

    private Helm helm;
    private Armor armor;
    private List<Weapon> weapons;
    private Shoes shoes;
    private List<Clothes> additionalClothes;


    @Override
    public Helm helm() {
        return null;
    }

    @Override
    public Armor armor() {
        return armor;
    }

    @Override
    public List<Weapon> weapons() {
        return weapons;
    }

    @Override
    public Shoes shoes() {
        return shoes;
    }

    @Override
    public List<Clothes> additionalClothes() {
        return additionalClothes;
    }
}

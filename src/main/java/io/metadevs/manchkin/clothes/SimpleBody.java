package io.metadevs.manchkin.clothes;

import java.util.List;

public class SimpleBody implements InPlayBody{

    private Helm helm;
    private Armor armor;
    private List<Weapon> weapons;
    private Shoes shoes;
    private List<Clothes> additionalClothes;

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public void setAdditionalClothes(List<Clothes> additionalClothes) {
        this.additionalClothes = additionalClothes;
    }

    @Override
    public Helm helm() {
        return helm;
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

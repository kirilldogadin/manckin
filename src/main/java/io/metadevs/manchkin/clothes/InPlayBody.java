package io.metadevs.manchkin.clothes;

import java.util.List;

/**
 * тело манчкина, на которое надевается шмот. то, что в InPlay СТОЛ но как бы только надетый шмот
 */
public interface InPlayBody {

    Helm helm();
    Armor armor();
    List<Weapon> weapons();
    Shoes shoes();

    List<Clothes> additionalClothes();

}

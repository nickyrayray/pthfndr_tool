package com.nick.pfinder.interfaces;

import com.nick.pfinder.character.components.abilityscore.AbilityScore;

/**
 * Created by nickyrayray on 11/17/16.
 */
public interface Character {

    AbilityScore getStr();
    AbilityScore getDex();
    AbilityScore getCon();
    AbilityScore getInt();
    AbilityScore getWis();
    AbilityScore getCha();

}

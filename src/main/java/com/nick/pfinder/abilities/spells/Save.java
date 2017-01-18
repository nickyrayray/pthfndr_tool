package com.nick.pfinder.abilities.spells;

import com.nick.pfinder.character.components.abilityscore.AbilityScore;

/**
 * Created by nickyrayray on 1/16/17.
 */
public enum Save {
    Fortitude(AbilityScore.CONSTITUTION),
    Reflex(AbilityScore.DEXTERITY),
    Will(AbilityScore.WISDOM);

    private final String att;

    Save(String att){
        this.att = att;
    }
}

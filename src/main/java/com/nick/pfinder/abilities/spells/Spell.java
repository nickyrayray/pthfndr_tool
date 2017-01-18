package com.nick.pfinder.abilities.spells;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nickyrayray on 1/16/17.
 */
public class Spell {

    private String name;
    private HashMap<String, Integer> levels;
    private String school;
    private List<Component> components;
    private Save save;
    private Boolean spellResistance;
    private String castingTime;

    public static Spell buildSpellFromScrapedHtml(String spellText){
        return null;
    }
}

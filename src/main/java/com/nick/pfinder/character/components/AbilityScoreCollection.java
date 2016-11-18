package com.nick.pfinder.character.components;

import java.util.HashMap;

/**
 * Created by nickyrayray on 11/17/16.
 */
public class AbilityScoreCollection {

    private HashMap<String, AbilityScore> abilityScores;

    public AbilityScoreCollection(){
        abilityScores = new HashMap<>();
        abilityScores.put(AbilityScore.STRENGTH, new AbilityScore(AbilityScore.STRENGTH));
        abilityScores.put(AbilityScore.DEXTERITY, new AbilityScore(AbilityScore.DEXTERITY));
        abilityScores.put(AbilityScore.CONSTITUTION, new AbilityScore(AbilityScore.CONSTITUTION));
        abilityScores.put(AbilityScore.INTELLIGENCE, new AbilityScore(AbilityScore.INTELLIGENCE));
        abilityScores.put(AbilityScore.WISDOM, new AbilityScore(AbilityScore.WISDOM));
        abilityScores.put(AbilityScore.CHARISMA, new AbilityScore(AbilityScore.CHARISMA));
    }

    public AbilityScore getStr(){
        return abilityScores.get(AbilityScore.STRENGTH);
    }

    public AbilityScore getDex(){
        return abilityScores.get(AbilityScore.DEXTERITY);
    }

    public AbilityScore getCon(){
        return abilityScores.get(AbilityScore.CONSTITUTION);
    }

    public AbilityScore getWis(){
        return abilityScores.get(AbilityScore.WISDOM);
    }

    public AbilityScore getInt(){
        return abilityScores.get(AbilityScore.INTELLIGENCE);
    }

    public AbilityScore getCha(){
        return abilityScores.get(AbilityScore.CHARISMA);
    }


}

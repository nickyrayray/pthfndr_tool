package com.nick.pfinder.character.components.abilityscore;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by nickyrayray on 11/17/16.
 */
public class AbilityScoreCollection {

    private HashMap<String, AbilityScore> abilityScores;

    public AbilityScoreCollection(){
        abilityScores = new HashMap<>();
        for(String s : AbilityScore.ABILITIES){
            abilityScores.put(s, new AbilityScore(s));
        }
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

    public AbilityScore get(String abilityScore){
        return abilityScores.get(abilityScore);
    }

    public Map<String, Integer> getAbilityScoreCollectionPojo(){
        return abilityScores.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey(),
                e -> e.getValue().getScore()
        ));
    }


}

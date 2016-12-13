package com.nick.pfinder.character.components.skill;

import com.nick.pfinder.character.components.abilityscore.AbilityScore;
import com.nick.pfinder.character.components.abilityscore.AbilityScoreCollection;
import com.nick.pfinder.interfaces.Character;
import com.nick.pfinder.server.PathfinderResourceConfig;
import org.glassfish.jersey.server.spi.ContainerLifecycleListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.security.Key;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by nickyrayray on 11/19/16.
 */
public class SkillSet {

    private HashMap<String, Skill> skillSet;

    public SkillSet(AbilityScoreCollection abilityScoreCollection, List<String> classSkills){
        skillSet = new HashMap<>();
        for(String skill : Skill.SKILLS){
            String associatedAbilityScoreName = Skill.SKILL_TO_ABILITY_SCORE_MAPPING.get(skill);
            AbilityScore abilityScore = abilityScoreCollection.get(associatedAbilityScoreName);
            skillSet.put(skill, new Skill(skill, abilityScore, classSkills.contains(skill)));
        }
    }

    public Skill getSkill(String key){
        Skill found = skillSet.get(key);
        if(found != null){
            return found;
        }
        Optional<String> skillSought = skillSet.keySet().stream().filter(s -> s.toLowerCase().contains(key.toLowerCase())).findFirst();
        if(skillSought.isPresent()){
            return skillSet.get(skillSought.get());
        } else {
            return null;
        }
    }

    public Map<String, Integer> getSkillSetPojo(){
        return skillSet.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey(),
                e -> e.getValue().calculateTotal()
        ));
    }

}

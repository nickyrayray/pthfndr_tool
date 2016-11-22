package com.nick.pfinder.character.components.skill;

import com.nick.pfinder.character.components.abilityscore.AbilityScoreCollection;
import com.nick.pfinder.interfaces.Character;
import org.glassfish.jersey.server.spi.ContainerLifecycleListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        skillSet.put(Skill.ACROBATICS, new Skill(Skill.ACROBATICS, abilityScoreCollection.getDex(), classSkills.contains(Skill.ACROBATICS)));
        skillSet.put(Skill.APPRAISE, new Skill(Skill.APPRAISE, abilityScoreCollection.getInt(), classSkills.contains(Skill.APPRAISE)));
        skillSet.put(Skill.BLUFF, new Skill(Skill.BLUFF, abilityScoreCollection.getCha(), classSkills.contains(Skill.BLUFF)));
        skillSet.put(Skill.CLIMB, new Skill(Skill.CLIMB, abilityScoreCollection.getStr(), classSkills.contains(Skill.CLIMB)));
        skillSet.put(Skill.CRAFT, new Skill(Skill.CRAFT, abilityScoreCollection.getInt(), classSkills.contains(Skill.CRAFT)));
        skillSet.put(Skill.DIPLOMACY, new Skill(Skill.DIPLOMACY, abilityScoreCollection.getCha(), classSkills.contains(Skill.DIPLOMACY)));
        skillSet.put(Skill.DISABLE_DEVICE, new Skill(Skill.DISABLE_DEVICE, abilityScoreCollection.getDex(), classSkills.contains(Skill.DISABLE_DEVICE)));
        skillSet.put(Skill.DISGUISE, new Skill(Skill.DISGUISE, abilityScoreCollection.getCha(), classSkills.contains(Skill.DISGUISE)));
        skillSet.put(Skill.ESCAPE_ARTIST, new Skill(Skill.ESCAPE_ARTIST, abilityScoreCollection.getDex(), classSkills.contains(Skill.ESCAPE_ARTIST)));
        skillSet.put(Skill.FLY, new Skill(Skill.FLY, abilityScoreCollection.getDex(), classSkills.contains(Skill.FLY)));
        skillSet.put(Skill.HANDLE_ANIMAL, new Skill(Skill.HANDLE_ANIMAL, abilityScoreCollection.getCha(), classSkills.contains(Skill.HANDLE_ANIMAL)));
        skillSet.put(Skill.HEAL, new Skill(Skill.HEAL, abilityScoreCollection.getWis(), classSkills.contains(Skill.HEAL)));
        skillSet.put(Skill.INTIMIDATE, new Skill(Skill.INTIMIDATE, abilityScoreCollection.getCha(), classSkills.contains(Skill.INTIMIDATE)));
        skillSet.put(Skill.KNOWLEDGE_ARCANA, new Skill(Skill.KNOWLEDGE_ARCANA, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_ARCANA)));
        skillSet.put(Skill.KNOWLEDGE_DUNGEON, new Skill(Skill.KNOWLEDGE_DUNGEON, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_DUNGEON)));
        skillSet.put(Skill.KNOWLEDGE_ENGINEERING, new Skill(Skill.KNOWLEDGE_ENGINEERING, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_ENGINEERING)));
        skillSet.put(Skill.KNOWLEDGE_GEOGRAPHY, new Skill(Skill.KNOWLEDGE_GEOGRAPHY, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_GEOGRAPHY)));
        skillSet.put(Skill.KNOWLEDGE_HISTORY, new Skill(Skill.KNOWLEDGE_HISTORY, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_HISTORY)));
        skillSet.put(Skill.KNOWLEDGE_LOCAL, new Skill(Skill.KNOWLEDGE_LOCAL, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_LOCAL)));
        skillSet.put(Skill.KNOWLEDGE_NATURE, new Skill(Skill.KNOWLEDGE_NATURE, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_NATURE)));
        skillSet.put(Skill.KNOWLEDGE_NOBILITY, new Skill(Skill.KNOWLEDGE_NOBILITY, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_NOBILITY)));
        skillSet.put(Skill.KNOWLEDGE_PLANES, new Skill(Skill.KNOWLEDGE_PLANES, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_PLANES)));
        skillSet.put(Skill.KNOWLEDGE_RELIGION, new Skill(Skill.KNOWLEDGE_RELIGION, abilityScoreCollection.getInt(), classSkills.contains(Skill.KNOWLEDGE_RELIGION)));
        skillSet.put(Skill.LINGUISTICS, new Skill(Skill.LINGUISTICS, abilityScoreCollection.getInt(), classSkills.contains(Skill.LINGUISTICS)));
        skillSet.put(Skill.PERCEPTION, new Skill(Skill.PERCEPTION, abilityScoreCollection.getWis(), classSkills.contains(Skill.PERCEPTION)));
        skillSet.put(Skill.PERFORM, new Skill(Skill.PERFORM, abilityScoreCollection.getCha(), classSkills.contains(Skill.PERFORM)));
        skillSet.put(Skill.PROFESSION, new Skill(Skill.PROFESSION, abilityScoreCollection.getWis(), classSkills.contains(Skill.PROFESSION)));
        skillSet.put(Skill.RIDE, new Skill(Skill.RIDE, abilityScoreCollection.getDex(), classSkills.contains(Skill.RIDE)));
        skillSet.put(Skill.SENSE_MOTIVE, new Skill(Skill.SENSE_MOTIVE, abilityScoreCollection.getWis(), classSkills.contains(Skill.SENSE_MOTIVE)));
        skillSet.put(Skill.SLEIGHT_OF_HAND, new Skill(Skill.SLEIGHT_OF_HAND, abilityScoreCollection.getDex(), classSkills.contains(Skill.SLEIGHT_OF_HAND)));
        skillSet.put(Skill.SPELLCRAFT, new Skill(Skill.SPELLCRAFT, abilityScoreCollection.getInt(), classSkills.contains(Skill.SPELLCRAFT)));
        skillSet.put(Skill.STEALTH, new Skill(Skill.STEALTH, abilityScoreCollection.getDex(), classSkills.contains(Skill.STEALTH)));
        skillSet.put(Skill.SURVIVAL, new Skill(Skill.SURVIVAL, abilityScoreCollection.getWis(), classSkills.contains(Skill.SURVIVAL)));
        skillSet.put(Skill.SWIM, new Skill(Skill.SWIM, abilityScoreCollection.getStr(), classSkills.contains(Skill.SWIM)));
        skillSet.put(Skill.USE_MAGIC_DEVICE, new Skill(Skill.USE_MAGIC_DEVICE, abilityScoreCollection.getCha(), classSkills.contains(Skill.USE_MAGIC_DEVICE)));
    }

    public Skill getSkill(String key){
        return skillSet.get(key);
    }

    public Map<String, Integer> getSkillSetPojo(){
        return skillSet.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey(),
                e -> e.getValue().calculateTotal()
        ));
    }

}

package com.nick.pfinder.character.components.skill;

import com.nick.pfinder.interfaces.Character;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nickyrayray on 11/19/16.
 */
public class SkillSet {

    @Autowired
    private Character character;

    private HashMap<String, Skill> skillSet;

    public SkillSet(List<String> classSkills){
        skillSet = new HashMap<>();
        skillSet.put(Skill.ACROBATICS, new Skill(Skill.ACROBATICS, character.getDex(), classSkills.contains(Skill.ACROBATICS)));
        skillSet.put(Skill.APPRAISE, new Skill(Skill.APPRAISE, character.getInt(), classSkills.contains(Skill.APPRAISE)));
        skillSet.put(Skill.BLUFF, new Skill(Skill.BLUFF, character.getCha(), classSkills.contains(Skill.BLUFF)));
        skillSet.put(Skill.CLIMB, new Skill(Skill.CLIMB, character.getStr(), classSkills.contains(Skill.CLIMB)));
        skillSet.put(Skill.CRAFT, new Skill(Skill.CRAFT, character.getInt(), classSkills.contains(Skill.CRAFT)));
        skillSet.put(Skill.DIPLOMACY, new Skill(Skill.DIPLOMACY, character.getCha(), classSkills.contains(Skill.DIPLOMACY)));
        skillSet.put(Skill.DISABLE_DEVICE, new Skill(Skill.DISABLE_DEVICE, character.getDex(), classSkills.contains(Skill.DISABLE_DEVICE)));
        skillSet.put(Skill.DISGUISE, new Skill(Skill.DISGUISE, character.getCha(), classSkills.contains(Skill.DISGUISE)));
        skillSet.put(Skill.ESCAPE_ARTIST, new Skill(Skill.ESCAPE_ARTIST, character.getDex(), classSkills.contains(Skill.ESCAPE_ARTIST)));
        skillSet.put(Skill.FLY, new Skill(Skill.FLY, character.getDex(), classSkills.contains(Skill.FLY)));
        skillSet.put(Skill.HANDLE_ANIMAL, new Skill(Skill.HANDLE_ANIMAL, character.getCha(), classSkills.contains(Skill.HANDLE_ANIMAL)));
        skillSet.put(Skill.HEAL, new Skill(Skill.HEAL, character.getWis(), classSkills.contains(Skill.HEAL)));
        skillSet.put(Skill.INTIMIDATE, new Skill(Skill.INTIMIDATE, character.getCha(), classSkills.contains(Skill.INTIMIDATE)));
        skillSet.put(Skill.KNOWLEDGE_ARCANA, new Skill(Skill.KNOWLEDGE_ARCANA, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_ARCANA)));
        skillSet.put(Skill.KNOWLEDGE_DUNGEON, new Skill(Skill.KNOWLEDGE_DUNGEON, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_DUNGEON)));
        skillSet.put(Skill.KNOWLEDGE_ENGINEERING, new Skill(Skill.KNOWLEDGE_ENGINEERING, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_ENGINEERING)));
        skillSet.put(Skill.KNOWLEDGE_GEOGRAPHY, new Skill(Skill.KNOWLEDGE_GEOGRAPHY, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_GEOGRAPHY)));
        skillSet.put(Skill.KNOWLEDGE_HISTORY, new Skill(Skill.KNOWLEDGE_HISTORY, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_HISTORY)));
        skillSet.put(Skill.KNOWLEDGE_LOCAL, new Skill(Skill.KNOWLEDGE_LOCAL, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_LOCAL)));
        skillSet.put(Skill.KNOWLEDGE_NATURE, new Skill(Skill.KNOWLEDGE_NATURE, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_NATURE)));
        skillSet.put(Skill.KNOWLEDGE_NOBILITY, new Skill(Skill.KNOWLEDGE_NOBILITY, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_NOBILITY)));
        skillSet.put(Skill.KNOWLEDGE_PLANES, new Skill(Skill.KNOWLEDGE_PLANES, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_PLANES)));
        skillSet.put(Skill.KNOWLEDGE_RELIGION, new Skill(Skill.KNOWLEDGE_RELIGION, character.getInt(), classSkills.contains(Skill.KNOWLEDGE_RELIGION)));
        skillSet.put(Skill.LINGUISTICS, new Skill(Skill.LINGUISTICS, character.getInt(), classSkills.contains(Skill.LINGUISTICS)));
        skillSet.put(Skill.PERCEPTION, new Skill(Skill.PERCEPTION, character.getWis(), classSkills.contains(Skill.PERCEPTION)));
        skillSet.put(Skill.PERFORM, new Skill(Skill.PERFORM, character.getCha(), classSkills.contains(Skill.PERFORM)));
        skillSet.put(Skill.PROFESSION, new Skill(Skill.PROFESSION, character.getWis(), classSkills.contains(Skill.PROFESSION)));
        skillSet.put(Skill.RIDE, new Skill(Skill.RIDE, character.getDex(), classSkills.contains(Skill.RIDE)));
        skillSet.put(Skill.SENSE_MOTIVE, new Skill(Skill.SENSE_MOTIVE, character.getWis(), classSkills.contains(Skill.SENSE_MOTIVE)));
        skillSet.put(Skill.SLEIGHT_OF_HAND, new Skill(Skill.SLEIGHT_OF_HAND, character.getDex(), classSkills.contains(Skill.SLEIGHT_OF_HAND)));
        skillSet.put(Skill.SPELLCRAFT, new Skill(Skill.SPELLCRAFT, character.getInt(), classSkills.contains(Skill.SPELLCRAFT)));
        skillSet.put(Skill.STEALTH, new Skill(Skill.STEALTH, character.getDex(), classSkills.contains(Skill.STEALTH)));
        skillSet.put(Skill.SURVIVAL, new Skill(Skill.SURVIVAL, character.getWis(), classSkills.contains(Skill.SURVIVAL)));
        skillSet.put(Skill.SWIM, new Skill(Skill.SWIM, character.getStr(), classSkills.contains(Skill.SWIM)));
        skillSet.put(Skill.USE_MAGIC_DEVICE, new Skill(Skill.USE_MAGIC_DEVICE, character.getCha(), classSkills.contains(Skill.USE_MAGIC_DEVICE)));
    }

    

}

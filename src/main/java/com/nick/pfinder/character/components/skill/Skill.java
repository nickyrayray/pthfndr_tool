package com.nick.pfinder.character.components.skill;

import com.nick.pfinder.character.components.abilityscore.AbilityScore;

import java.util.HashMap;

/**
 * Created by nickyrayray on 11/19/16.
 */
public class Skill {

    private String name;
    private AbilityScore abilityScore;
    private int ranks;
    private boolean isClassSkill;

    public Skill(String name, AbilityScore abilityScore, boolean isClassSkill){
        this.name = name;
        this.abilityScore = abilityScore;
        this.ranks = 0;
        this.isClassSkill = isClassSkill;
    }

    public Skill(String name, AbilityScore abilityScore, int ranks, boolean isClassSkill){
        this.name = name;
        this.abilityScore = abilityScore;
        this.ranks = ranks;
        this.isClassSkill = isClassSkill;
    }

    public int getRanks(){
        return ranks;
    }

    public void increaseRanks(int amount){
        this.ranks += amount;
    }

    public String getName(){
        return name;
    }

    public void setClassSkill(){
        this.isClassSkill = true;
    }

    public int calculateTotal(){
        int classSkillSection = (isClassSkill && ranks > 0) ? 3 : 0;
        return ranks + abilityScore.getModifier() + classSkillSection;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(o == this){
            return true;
        }
        if(!(o instanceof Skill)){
            return false;
        }
        Skill other = (Skill)o;
        return (other.name.equals(this.name) &&
                other.ranks == this.ranks &&
                other.abilityScore.equals(this.abilityScore) &&
                other.isClassSkill == this.isClassSkill);
    }

    public static final String ACROBATICS = "Acrobatics";
    public static final String APPRAISE = "Appraise";
    public static final String BLUFF = "Bluff";
    public static final String CLIMB = "Climb";
    public static final String CRAFT = "Craft";
    public static final String DIPLOMACY = "Diplomacy";
    public static final String DISABLE_DEVICE = "Disable Device";
    public static final String DISGUISE = "Disguise";
    public static final String ESCAPE_ARTIST = "Escape Artist";
    public static final String FLY = "Fly";
    public static final String HANDLE_ANIMAL = "Handle Animal";
    public static final String HEAL = "Heal";
    public static final String INTIMIDATE = "Intimidate";
    public static final String KNOWLEDGE_ARCANA = "Knowledge Arcana";
    public static final String KNOWLEDGE_DUNGEON = "Knowledge Dungeon";
    public static final String KNOWLEDGE_ENGINEERING = "Knowledge Engineering";
    public static final String KNOWLEDGE_GEOGRAPHY = "Knowledge Geography";
    public static final String KNOWLEDGE_HISTORY = "Knowledge History";
    public static final String KNOWLEDGE_LOCAL = "Knowledge Local";
    public static final String KNOWLEDGE_NATURE = "Knowledge Nature";
    public static final String KNOWLEDGE_NOBILITY = "Knowledge Nobility";
    public static final String KNOWLEDGE_PLANES = "Knowledge Planes";
    public static final String KNOWLEDGE_RELIGION = "Knowledge Religion";
    public static final String LINGUISTICS = "Linguistics";
    public static final String PERCEPTION = "Perception";
    public static final String PERFORM = "Perform";
    public static final String PROFESSION = "Profession";
    public static final String RIDE = "Ride";
    public static final String SENSE_MOTIVE = "Sense Motive";
    public static final String SLEIGHT_OF_HAND = "Sleight Of Hand";
    public static final String SPELLCRAFT = "Spellcraft";
    public static final String STEALTH = "Stealth";
    public static final String SURVIVAL = "Survival";
    public static final String SWIM = "Swim";
    public static final String USE_MAGIC_DEVICE = "Use Magic Device";

    public static final String[] SKILLS = {
            ACROBATICS,
            APPRAISE,
            BLUFF,
            CLIMB,
            CRAFT,
            DIPLOMACY,
            DISABLE_DEVICE,
            DISGUISE,
            ESCAPE_ARTIST,
            FLY,
            HANDLE_ANIMAL,
            HEAL,
            INTIMIDATE,
            KNOWLEDGE_ARCANA,
            KNOWLEDGE_DUNGEON,
            KNOWLEDGE_ENGINEERING,
            KNOWLEDGE_GEOGRAPHY,
            KNOWLEDGE_HISTORY,
            KNOWLEDGE_LOCAL,
            KNOWLEDGE_NATURE,
            KNOWLEDGE_NOBILITY,
            KNOWLEDGE_PLANES,
            KNOWLEDGE_RELIGION,
            LINGUISTICS,
            PERCEPTION,
            PERFORM,
            PROFESSION,
            RIDE,
            SENSE_MOTIVE,
            SLEIGHT_OF_HAND,
            SPELLCRAFT,
            STEALTH,
            SURVIVAL,
            SWIM,
            USE_MAGIC_DEVICE
    };

    public static final HashMap<String, String> SKILL_TO_ABILITY_SCORE_MAPPING = buildSkillToAbilityScoreMapping();

    private static HashMap<String, String> buildSkillToAbilityScoreMapping(){
        HashMap<String, String> mapping = new HashMap<>();
        mapping.put(ACROBATICS, AbilityScore.DEXTERITY);
        mapping.put(APPRAISE, AbilityScore.INTELLIGENCE);
        mapping.put(BLUFF, AbilityScore.CHARISMA);
        mapping.put(CLIMB, AbilityScore.STRENGTH);
        mapping.put(CRAFT, AbilityScore.INTELLIGENCE);
        mapping.put(DIPLOMACY, AbilityScore.CHARISMA);
        mapping.put(DISABLE_DEVICE, AbilityScore.DEXTERITY);
        mapping.put(DISGUISE, AbilityScore.CHARISMA);
        mapping.put(ESCAPE_ARTIST, AbilityScore.DEXTERITY);
        mapping.put(FLY, AbilityScore.DEXTERITY);
        mapping.put(HANDLE_ANIMAL, AbilityScore.CHARISMA);
        mapping.put(HEAL, AbilityScore.WISDOM);
        mapping.put(INTIMIDATE, AbilityScore.CHARISMA);
        mapping.put(KNOWLEDGE_ARCANA, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_DUNGEON, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_ENGINEERING, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_GEOGRAPHY, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_HISTORY, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_LOCAL, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_NATURE, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_NOBILITY, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_PLANES, AbilityScore.INTELLIGENCE);
        mapping.put(KNOWLEDGE_RELIGION, AbilityScore.INTELLIGENCE);
        mapping.put(LINGUISTICS, AbilityScore.INTELLIGENCE);
        mapping.put(PERCEPTION, AbilityScore.WISDOM);
        mapping.put(PERFORM, AbilityScore.CHARISMA);
        mapping.put(PROFESSION, AbilityScore.WISDOM);
        mapping.put(RIDE, AbilityScore.DEXTERITY);
        mapping.put(SENSE_MOTIVE, AbilityScore.WISDOM);
        mapping.put(SLEIGHT_OF_HAND, AbilityScore.DEXTERITY);
        mapping.put(SPELLCRAFT, AbilityScore.INTELLIGENCE);
        mapping.put(STEALTH, AbilityScore.DEXTERITY);
        mapping.put(SURVIVAL, AbilityScore.WISDOM);
        mapping.put(SWIM, AbilityScore.STRENGTH);
        mapping.put(USE_MAGIC_DEVICE, AbilityScore.CHARISMA);
        return mapping;
    }

}

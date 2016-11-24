package com.nick.pfinder.character.components.skill;

import com.nick.pfinder.character.components.abilityscore.AbilityScore;

/**
 * Created by nickyrayray on 11/19/16.
 */
public class Skill {

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

}

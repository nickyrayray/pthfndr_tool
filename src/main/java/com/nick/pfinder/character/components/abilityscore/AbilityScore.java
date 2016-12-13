package com.nick.pfinder.character.components.abilityscore;

/**
 * Created by nickyrayray on 11/17/16.
 */
public class AbilityScore {

    public static final String STRENGTH = "Strength";
    public static final String DEXTERITY = "Dexterity";
    public static final String CONSTITUTION = "Constitution";
    public static final String INTELLIGENCE = "Intelligence";
    public static final String WISDOM = "Wisdom";
    public static final String CHARISMA = "Charisma";

    public static final String[] ABILITIES = {STRENGTH, DEXTERITY, CONSTITUTION, INTELLIGENCE, WISDOM, CHARISMA};

    private String name;
    private int score;

    public AbilityScore(String name){
        this.name = name;
        this.score = 10;
    }

    public AbilityScore(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getModifier(){
        return (int)Math.floor((score - 10.0)/2.0);
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(o == this){
            return true;
        }
        if(!(o instanceof AbilityScore)){
            return false;
        }
        AbilityScore other = (AbilityScore)o;
        return (other.getScore() == this.score && other.getName().equals(this.name));
    }

}

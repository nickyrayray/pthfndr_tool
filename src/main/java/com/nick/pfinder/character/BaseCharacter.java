package com.nick.pfinder.character;

import com.nick.pfinder.character.components.abilityscore.AbilityScore;
import com.nick.pfinder.character.components.abilityscore.AbilityScoreCollection;
import com.nick.pfinder.character.components.skill.SkillSet;
import com.nick.pfinder.character.pojo.CharacterPojo;
import com.nick.pfinder.interfaces.Character;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * Created by nickyrayray on 11/14/16.
 */
public class BaseCharacter implements Character{

    @Autowired
    private List<String> classSkills;

    private AbilityScoreCollection abilityScoreCollection;
    private SkillSet skillSet;

    /*TODO: This*/
    private String name;
    private int level;
    private String race;

    public BaseCharacter(){
        abilityScoreCollection = new AbilityScoreCollection();
        skillSet = new SkillSet(abilityScoreCollection, classSkills);
    }

    @Override
    public AbilityScore getStr() {
        return abilityScoreCollection.getStr();
    }

    @Override
    public AbilityScore getDex() {
        return abilityScoreCollection.getDex();
    }

    @Override
    public AbilityScore getCon() {
        return abilityScoreCollection.getCon();
    }

    @Override
    public AbilityScore getInt() {
         return abilityScoreCollection.getInt();
    }

    @Override
    public AbilityScore getWis() {
        return abilityScoreCollection.getWis();
    }

    @Override
    public AbilityScore getCha() {
        return abilityScoreCollection.getCha();
    }

    @Override
    public CharacterPojo getPojo(){
        return null;
    }
}

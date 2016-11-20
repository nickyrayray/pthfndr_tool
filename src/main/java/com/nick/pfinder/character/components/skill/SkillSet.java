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

    public SkillSet(List<String> ClassSkills){
        skillSet = new HashMap<>();
        skillSet.put(Skill.ACROBATICS, new Skill())
    }
}

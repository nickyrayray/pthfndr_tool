package nick.pfinder.model.character.skill;

import nick.pfinder.model.character.ability.AbilityScore;
import nick.pfinder.model.modifier.Modifier;

/**
 * Created by nickyrayray on 8/17/17.
 */
public class Skill implements Modifier{

    private Integer ranks;
    private boolean isClassSkill;
    private AbilityScore associatedAbilityScore;

    public Integer getRanks() {
        return ranks;
    }

    public void setRanks(Integer ranks) {
        this.ranks = ranks;
    }

    public boolean isClassSkill() {
        return isClassSkill;
    }

    public void setClassSkill(boolean classSkill) {
        isClassSkill = classSkill;
    }


    @Override
    public Integer getModifier() {
        int total = ranks + associatedAbilityScore.getModifier();
        if(isClassSkill && ranks > 0){
            total += 3;
        }
        return total;
    }

    @Override
    public String getModifierString() {
        return null;
    }
}

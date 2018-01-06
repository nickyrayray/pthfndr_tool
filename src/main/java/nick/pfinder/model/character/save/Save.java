package nick.pfinder.model.character.save;

import nick.pfinder.model.character.ability.AbilityScore;
import nick.pfinder.model.modifier.Modifier;

public class Save implements Modifier {

    private String name;
    private Integer classBase;
    private AbilityScore associatedAbilityScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassBase() {
        return classBase;
    }

    public void setClassBase(Integer classBase) {
        this.classBase = classBase;
    }

    public AbilityScore getAssociatedAbilityScore() {
        return associatedAbilityScore;
    }

    public void setAssociatedAbilityScore(AbilityScore associatedAbilityScore) {
        this.associatedAbilityScore = associatedAbilityScore;
    }

    @Override
    public Integer getModifier() {
        return classBase + associatedAbilityScore.getModifier();
    }

    @Override
    public String getModifierString() {
        return null;
    }
}

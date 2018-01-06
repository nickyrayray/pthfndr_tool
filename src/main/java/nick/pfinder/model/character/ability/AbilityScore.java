package nick.pfinder.model.character.ability;

import nick.pfinder.model.modifier.Modifier;

/**
 * Created by nickyrayray on 8/17/17.
 */
public class AbilityScore implements Modifier {

    private Integer score;
    private String name;

    public AbilityScore(String name, Integer score){
        this.name = name;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getModifier() {
        double modifier = (score - 10.0)/2.0;
        return (int) (modifier > 0 ? modifier : Math.floor(modifier));
    }

    @Override
    public String getModifierString() {
        return null;
    }
}

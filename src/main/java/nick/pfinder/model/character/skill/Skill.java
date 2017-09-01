package nick.pfinder.model.character.skill;

/**
 * Created by nickyrayray on 8/17/17.
 */
public class Skill {

    private Integer ranks;
    private boolean isClassSkill;

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
}

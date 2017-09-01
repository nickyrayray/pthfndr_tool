package nick.pfinder.model.items.weapons;

import nick.pfinder.model.items.Item;
import nick.pfinder.model.items.money.Price;
import nick.pfinder.util.Range;

/**
 * Created by nickyrayray on 8/24/17.
 */
public class Weapon extends Item {

    private String damageDice;
    private Range critRange;
    private String range;
    private Price cost;
    private Integer criticalMultiplier;

    public Price getCost() {
        return cost;
    }

    public void setCost(Price cost) {
        this.cost = cost;
    }

    public String getDamageDice() {
        return damageDice;
    }

    public void setDamageDice(String damageDice) {
        this.damageDice = damageDice;
    }

    public Range getCritRange() {
        return critRange;
    }

    public void setCritRange(Range critRange) {
        this.critRange = critRange;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Integer getCriticalMultiplier() {
        return criticalMultiplier;
    }

    public void setCriticalMultiplier(Integer criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }
}

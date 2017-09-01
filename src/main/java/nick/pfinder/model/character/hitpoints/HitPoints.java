package nick.pfinder.model.character.hitpoints;

/**
 * Created by nickyrayray on 8/24/17.
 */
public class HitPoints {

    public Integer total;
    public Integer damage;
    public Integer nonLethalDamage;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getNonLethalDamage() {
        return nonLethalDamage;
    }

    public void setNonLethalDamage(Integer nonLethalDamage) {
        this.nonLethalDamage = nonLethalDamage;
    }
}

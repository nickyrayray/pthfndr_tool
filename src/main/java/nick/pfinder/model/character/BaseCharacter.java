package nick.pfinder.model.character;

import nick.pfinder.model.character.ability.AbilityScore;
import nick.pfinder.model.character.attributes.Alignment;
import nick.pfinder.model.character.attributes.Size;
import nick.pfinder.model.character.hitpoints.HitPoints;
import nick.pfinder.model.character.skill.Skill;
import nick.pfinder.model.items.Item;
import nick.pfinder.model.items.armor.Armor;
import nick.pfinder.model.items.weapons.Weapon;

import java.util.List;
import java.util.Map;

/**
 * Created by nickyrayray on 8/17/17.
 */
public abstract class BaseCharacter implements Character{

    private Map<String, String> basicInfo;

    private HitPoints hitPoints;

    private Map<String, AbilityScore> abilityScores;

    private Map<String, Skill> skills;

    private List<Integer> baseAttackBonus;

    private Integer will;
    private Integer fortitude;
    private Integer reflex;

    private List<Item> items;

    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public Map<String, String> getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(Map<String, String> basicInfo) {
        this.basicInfo = basicInfo;
    }

    public HitPoints getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(HitPoints hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Map<String, AbilityScore> getAbilityScores() {
        return abilityScores;
    }

    public void setAbilityScores(Map<String, AbilityScore> abilityScores) {
        this.abilityScores = abilityScores;
    }

    public Map<String, Skill> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, Skill> skills) {
        this.skills = skills;
    }

    public List<Integer> getBaseAttackBonus() {
        return baseAttackBonus;
    }

    public void setBaseAttackBonus(List<Integer> baseAttackBonus) {
        this.baseAttackBonus = baseAttackBonus;
    }

    public Integer getWill() {
        return will;
    }

    public void setWill(Integer will) {
        this.will = will;
    }

    public Integer getFortitude() {
        return fortitude;
    }

    public void setFortitude(Integer fortitude) {
        this.fortitude = fortitude;
    }

    public Integer getReflex() {
        return reflex;
    }

    public void setReflex(Integer reflex) {
        this.reflex = reflex;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    public void setEquippedArmor(Armor equippedArmor) {
        this.equippedArmor = equippedArmor;
    }
}

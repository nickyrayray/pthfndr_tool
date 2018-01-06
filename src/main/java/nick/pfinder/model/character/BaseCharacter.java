package nick.pfinder.model.character;

import nick.pfinder.model.character.ability.AbilityScore;
import nick.pfinder.model.character.attributes.Alignment;
import nick.pfinder.model.character.attributes.Size;
import nick.pfinder.model.character.hitpoints.HitPoints;
import nick.pfinder.model.character.save.Save;
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

    //Basic info
    private String name;
    private String playerName;
    private Alignment alignment;
    private Integer level;
    private String deity;
    private String race;
    private Size size;
    private String gender;
    private Integer age;

    private HitPoints hitPoints;

    private Map<String, AbilityScore> abilityScores;

    private Map<String, Skill> skills;

    private List<Integer> baseAttackBonus;

    private Save will;
    private Save fortitude;
    private Save reflex;

    private List<Item> items;
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public BaseCharacter(BaseCharacter baseCharacter){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDeity() {
        return deity;
    }

    public void setDeity(String deity) {
        this.deity = deity;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Save getWill() {
        return will;
    }

    public void setWill(Save will) {
        this.will = will;
    }

    public Save getFortitude() {
        return fortitude;
    }

    public void setFortitude(Save fortitude) {
        this.fortitude = fortitude;
    }

    public Save getReflex() {
        return reflex;
    }

    public void setReflex(Save reflex) {
        this.reflex = reflex;
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

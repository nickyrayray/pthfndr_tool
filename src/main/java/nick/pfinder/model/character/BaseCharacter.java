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

    private String name;
    private Integer age;
    private Alignment alignment;
    private Integer level;
    private Size size;
    private String gender;

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

}

package nick.pfinder.model.character.base;

import java.util.List;

/**
 * Created by nickyrayray on 8/17/17.
 */
public abstract class Character {

    // Basic info
    private String name;
    private String player;
    private String alignment; // Should be an enum?
    private Integer level;
    private String deity;
    private String race; // Should be an enum?
    private String gender;
    private Integer age;

    // Ability Scores
    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer intelligence;
    private Integer wisdom;
    private Integer charisma;

    // Skills
    private Integer acrobatics;
    private Integer appraise;
    private Integer bluff;
    private Integer climb;
    private Integer craft;
    private Integer diplomacy;
    private Integer disableDevice;
    private Integer disguise;
    private Integer escapeArtist;
    private Integer fly;
    private Integer handleAnimal;
    private Integer heal;
    private Integer intimidate;
    private Integer knowledgeArcana;
    private Integer knowledgeDungeoneering;
    private Integer knowledgeEngineering;
    private Integer knowledgeGeography;
    private Integer knowledgeHistory;
    private Integer knowledgeLocal;
    private Integer knowledgeNature;
    private Integer knowledgeNobility;
    private Integer knowledgePlanes;
    private Integer knowledgeReligion;
    private Integer linguistics;
    private Integer perception;
    private Integer perform;
    private Integer profession;
    private Integer ride;
    private Integer senseMotive;
    private Integer sleightOfHand;
    private Integer spellcraft;
    private Integer stealth;
    private Integer survival;
    private Integer swim;
    private Integer useMagicDevice;

    // Saves
    private Integer fortitude;
    private Integer reflex;
    private Integer will;

    //Base Attack Bonus
    private List<Integer> baseAttackBonus;

    // Misc
    private Integer baseSpeed;
    private Integer swimSpeed;
    private Integer flySpeed;
    private String size; // should be enum


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
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
        race = race;
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

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getConstitution() {
        return constitution;
    }

    public void setConstitution(Integer constitution) {
        this.constitution = constitution;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(Integer acrobatics) {
        this.acrobatics = acrobatics;
    }

    public Integer getAppraise() {
        return appraise;
    }

    public void setAppraise(Integer appraise) {
        this.appraise = appraise;
    }

    public Integer getBluff() {
        return bluff;
    }

    public void setBluff(Integer bluff) {
        this.bluff = bluff;
    }

    public Integer getClimb() {
        return climb;
    }

    public void setClimb(Integer climb) {
        this.climb = climb;
    }

    public Integer getCraft() {
        return craft;
    }

    public void setCraft(Integer craft) {
        this.craft = craft;
    }

    public Integer getDiplomacy() {
        return diplomacy;
    }

    public void setDiplomacy(Integer diplomacy) {
        this.diplomacy = diplomacy;
    }

    public Integer getDisableDevice() {
        return disableDevice;
    }

    public void setDisableDevice(Integer disableDevice) {
        this.disableDevice = disableDevice;
    }

    public Integer getDisguise() {
        return disguise;
    }

    public void setDisguise(Integer disguise) {
        this.disguise = disguise;
    }

    public Integer getEscapeArtist() {
        return escapeArtist;
    }

    public void setEscapeArtist(Integer escapeArtist) {
        this.escapeArtist = escapeArtist;
    }

    public Integer getFly() {
        return fly;
    }

    public void setFly(Integer fly) {
        this.fly = fly;
    }

    public Integer getHandleAnimal() {
        return handleAnimal;
    }

    public void setHandleAnimal(Integer handleAnimal) {
        this.handleAnimal = handleAnimal;
    }

    public Integer getHeal() {
        return heal;
    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public Integer getIntimidate() {
        return intimidate;
    }

    public void setIntimidate(Integer intimidate) {
        this.intimidate = intimidate;
    }

    public Integer getKnowledgeArcana() {
        return knowledgeArcana;
    }

    public void setKnowledgeArcana(Integer knowledgeArcana) {
        this.knowledgeArcana = knowledgeArcana;
    }

    public Integer getKnowledgeDungeoneering() {
        return knowledgeDungeoneering;
    }

    public void setKnowledgeDungeoneering(Integer knowledgeDungeoneering) {
        this.knowledgeDungeoneering = knowledgeDungeoneering;
    }

    public Integer getKnowledgeEngineering() {
        return knowledgeEngineering;
    }

    public void setKnowledgeEngineering(Integer knowledgeEngineering) {
        this.knowledgeEngineering = knowledgeEngineering;
    }

    public Integer getKnowledgeGeography() {
        return knowledgeGeography;
    }

    public void setKnowledgeGeography(Integer knowledgeGeography) {
        this.knowledgeGeography = knowledgeGeography;
    }

    public Integer getKnowledgeHistory() {
        return knowledgeHistory;
    }

    public void setKnowledgeHistory(Integer knowledgeHistory) {
        this.knowledgeHistory = knowledgeHistory;
    }

    public Integer getKnowledgeLocal() {
        return knowledgeLocal;
    }

    public void setKnowledgeLocal(Integer knowledgeLocal) {
        this.knowledgeLocal = knowledgeLocal;
    }

    public Integer getKnowledgeNature() {
        return knowledgeNature;
    }

    public void setKnowledgeNature(Integer knowledgeNature) {
        this.knowledgeNature = knowledgeNature;
    }

    public Integer getKnowledgeNobility() {
        return knowledgeNobility;
    }

    public void setKnowledgeNobility(Integer knowledgeNobility) {
        this.knowledgeNobility = knowledgeNobility;
    }

    public Integer getKnowledgePlanes() {
        return knowledgePlanes;
    }

    public void setKnowledgePlanes(Integer knowledgePlanes) {
        this.knowledgePlanes = knowledgePlanes;
    }

    public Integer getKnowledgeReligion() {
        return knowledgeReligion;
    }

    public void setKnowledgeReligion(Integer knowledgeReligion) {
        this.knowledgeReligion = knowledgeReligion;
    }

    public Integer getLinguistics() {
        return linguistics;
    }

    public void setLinguistics(Integer linguistics) {
        this.linguistics = linguistics;
    }

    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

    public Integer getPerform() {
        return perform;
    }

    public void setPerform(Integer perform) {
        this.perform = perform;
    }

    public Integer getProfession() {
        return profession;
    }

    public void setProfession(Integer profession) {
        this.profession = profession;
    }

    public Integer getRide() {
        return ride;
    }

    public void setRide(Integer ride) {
        this.ride = ride;
    }

    public Integer getSenseMotive() {
        return senseMotive;
    }

    public void setSenseMotive(Integer senseMotive) {
        this.senseMotive = senseMotive;
    }

    public Integer getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(Integer sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public Integer getSpellcraft() {
        return spellcraft;
    }

    public void setSpellcraft(Integer spellcraft) {
        this.spellcraft = spellcraft;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public Integer getSurvival() {
        return survival;
    }

    public void setSurvival(Integer survival) {
        this.survival = survival;
    }

    public Integer getSwim() {
        return swim;
    }

    public void setSwim(Integer swim) {
        this.swim = swim;
    }

    public Integer getUseMagicDevice() {
        return useMagicDevice;
    }

    public void setUseMagicDevice(Integer useMagicDevice) {
        this.useMagicDevice = useMagicDevice;
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

    public Integer getWill() {
        return will;
    }

    public void setWill(Integer will) {
        this.will = will;
    }

    public List<Integer> getBaseAttackBonus() {
        return baseAttackBonus;
    }

    public void setBaseAttackBonus(List<Integer> baseAttackBonus) {
        this.baseAttackBonus = baseAttackBonus;
    }

    public Integer getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(Integer baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

    public Integer getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(Integer swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Integer getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(Integer flySpeed) {
        this.flySpeed = flySpeed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

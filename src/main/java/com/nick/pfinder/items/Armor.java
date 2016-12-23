package com.nick.pfinder.items;

/**
 * Created by nickyrayray on 12/23/16.
 */
public class Armor {

    private String name;
    private int armorBonus;
    private int maxDexBonus;
    private int cost;
    private int armorCheckPenalty;
    private double arcaneSpellFailureChance;
    private int movementSpeed;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorBonus() {
        return armorBonus;
    }

    public void setArmorBonus(int armorBonus) {
        this.armorBonus = armorBonus;
    }

    public int getMaxDexBonus() {
        return maxDexBonus;
    }

    public void setMaxDexBonus(int maxDexBonus) {
        this.maxDexBonus = maxDexBonus;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getArmorCheckPenalty() {
        return armorCheckPenalty;
    }

    public void setArmorCheckPenalty(int armorCheckPenalty) {
        this.armorCheckPenalty = armorCheckPenalty;
    }

    public double getArcaneSpellFailureChance() {
        return arcaneSpellFailureChance;
    }

    public void setArcaneSpellFailureChance(double arcaneSpellFailureChance) {
        this.arcaneSpellFailureChance = arcaneSpellFailureChance;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

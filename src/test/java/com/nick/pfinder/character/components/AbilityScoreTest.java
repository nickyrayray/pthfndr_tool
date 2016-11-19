package com.nick.pfinder.character.components;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by nickyrayray on 11/17/16.
 */
public class AbilityScoreTest {

    @Test
    public void testNameOnlyConstructorDefaultsAbilityScoreTo10(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.STRENGTH);
        assertEquals(10, abilityScore.getScore());
    }

    @Test
    public void testNameAndScoreConstructorSetsTheAbilityScoreCorrectly(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.STRENGTH, 55);
        assertEquals(55, abilityScore.getScore());
        assertEquals(AbilityScore.STRENGTH, abilityScore.getName());
    }

    @Test
    public void testEqualsOnEqualObjects(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.STRENGTH);
        AbilityScore abilityScore2 = new AbilityScore(AbilityScore.STRENGTH, 10);
        assertEquals(abilityScore, abilityScore2);
    }

    @Test
    public void testEqualsOnObjectWithDifferentNames(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.DEXTERITY);
        AbilityScore abilityScore2 = new AbilityScore(AbilityScore.STRENGTH, 10);
        assertNotEquals(abilityScore, abilityScore2);
    }

    @Test
    public void testEqualsOnObjectsWithDifferentScores(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.STRENGTH);
        AbilityScore abilityScore2 = new AbilityScore(AbilityScore.STRENGTH, 12);
        assertNotEquals(abilityScore, abilityScore2);
    }

    @Test
    public void testEqualsOnObjectsWithDifferentScoresAndNames(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.DEXTERITY);
        AbilityScore abilityScore2 = new AbilityScore(AbilityScore.CHARISMA, 60);
        assertNotEquals(abilityScore, abilityScore2);
    }

    @Test
    public void testGetModifierOnAbilityScoreWithDefaultScoreConstructor(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.CONSTITUTION);
        assertEquals(0, abilityScore.getModifier());
    }

    @Test
    public void testGetModifierOnAbilityScoreWithEvenNumberGreaterThan10(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.CONSTITUTION, 16);
        assertEquals(3, abilityScore.getModifier());
    }

    @Test
    public void testGetModifierOnAbilityScoreWithOddNumberGreaterThan10ShowCorrectFloorBehavior(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.CONSTITUTION, 17);
        assertEquals(3, abilityScore.getModifier());
    }

    @Test
    public void testGetModifierOnAbilityScoreWithEvenNumberLessThan10(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.CONSTITUTION, 6);
        assertEquals(-2, abilityScore.getModifier());
    }

    @Test
    public void testGetModifierOnAbilityScoreWithOddNumberLessThan10ShowCorrectFloorBehavior(){
        AbilityScore abilityScore = new AbilityScore(AbilityScore.CONSTITUTION, 7);
        assertEquals(-2, abilityScore.getModifier());
    }

}

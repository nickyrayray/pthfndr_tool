package com.nick.pfinder.character.components;

import static org.junit.Assert.*;

import com.nick.pfinder.character.components.abilityscore.AbilityScore;
import com.nick.pfinder.character.components.abilityscore.AbilityScoreCollection;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nickyrayray on 11/17/16.
 */
public class AbilityScoreCollectionTest {

    protected AbilityScoreCollection abilityScoreCollection;

    @Before
    public void setUp(){
        abilityScoreCollection = new AbilityScoreCollection();
    }

    @Test
    public void testForStrengthAbilityScorePresent(){
        AbilityScore str = abilityScoreCollection.getStr();
        assertNotNull(str);
    }

    @Test
    public void testForStrenghtAbilityScoreEqualsDefault(){
        AbilityScore strDefault = new AbilityScore(AbilityScore.STRENGTH);
        AbilityScore str = abilityScoreCollection.getStr();
        assertEquals(strDefault, str);
    }

    @Test
    public void testIncreaseStrengthAndAbilityScoreReflects(){
        AbilityScore strTwelve = new AbilityScore(AbilityScore.STRENGTH, 12);
        AbilityScore str = abilityScoreCollection.getStr();
        str.setScore(12);
        assertEquals(str, strTwelve);
        str = abilityScoreCollection.getStr();
        assertEquals(str, strTwelve);
    }

    @Test
    public void testForDexterityAbilityScorePresent(){
        AbilityScore dex = abilityScoreCollection.getDex();
        assertNotNull(dex);
    }

    @Test
    public void testForDexterityAbilityScoreEqualsDefault(){
        AbilityScore dexDefault = new AbilityScore(AbilityScore.DEXTERITY);
        AbilityScore dex = abilityScoreCollection.getDex();
        assertEquals(dexDefault, dex);
    }

    @Test
    public void testIncreaseDexterityAndAbilityScoreReflects(){
        AbilityScore dexTwelve = new AbilityScore(AbilityScore.DEXTERITY, 12);
        AbilityScore dex = abilityScoreCollection.getDex();
        dex.setScore(12);
        assertEquals(dex, dexTwelve);
        dex = abilityScoreCollection.getDex();
        assertEquals(dex, dexTwelve);
    }

}

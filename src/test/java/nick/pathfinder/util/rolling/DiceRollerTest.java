package nick.pathfinder.util.rolling;

import nick.pfinder.util.rolling.DiceRoller;
import nick.pfinder.util.rolling.RollStringParseException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nickyrayray on 8/26/17.
 */
public class DiceRollerTest {

    @Test
    public void testThatStringStartingWithDWorkedCorrectly() throws RollStringParseException {
        String parseTest = "d20";
        String expected = "1d20";
        DiceRoller d20 = DiceRoller.createDiceRoller(parseTest);
        assertEquals(expected, d20.toString());
    }

    @Test
    public void testThatStringStartingWithNumberWorksCorrectly() throws RollStringParseException {
        String parseTest = "12d46";
        String expected = "12d46";
        DiceRoller test = DiceRoller.createDiceRoller(parseTest);
        assertEquals(expected, test.toString());
    }

    @Test(expected = RollStringParseException.class)
    public void testThatStringStartingWithNegativeNumberThrowsException() throws RollStringParseException {
        String parseTest = "-12d46";
        DiceRoller test = DiceRoller.createDiceRoller(parseTest);
    }

    @Test
    public void testAddingModifierIsAccepted() throws RollStringParseException {
        String parseTest = "12d46+6";
        String expected = "12d46+6";
        DiceRoller test = DiceRoller.createDiceRoller(parseTest);
        assertEquals(expected, test.toString());
    }

    @Test
    public void testAddingNegativeModifierIsAccepted() throws RollStringParseException {
        String parseTest = "12d46-6";
        String expected = "12d46-6";
        DiceRoller test = DiceRoller.createDiceRoller(parseTest);
        assertEquals(expected, test.toString());
    }

    @Test
    public void testAddingMultipleModifiersIsAccepted() throws RollStringParseException {
        String parseTest = "12d46+6-14+12";
        String expected = "12d46+6-14+12";
        DiceRoller test = DiceRoller.createDiceRoller(parseTest);
        assertEquals(expected, test.toString());
    }

    @Test
    public void testSpacingIsAllowedBetweenComponentsAndIgnored() throws RollStringParseException {
        String parseTest = "12     d 46 +6                ";
        String expected = "12d46+6";
        DiceRoller test = DiceRoller.createDiceRoller(parseTest);
        assertEquals(expected, test.toString());
    }

    @Test
    public void testSpacingAllowedBetweenModiferOperatorsAndComponents() throws RollStringParseException {
        String parseTest = "12     d 46 +         6                ";
        String expected = "12d46+6";
        DiceRoller test = DiceRoller.createDiceRoller(parseTest);
        assertEquals(expected, test.toString());
    }

}

package nick.pfinder.util.rolling;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nickyrayray on 8/24/17.
 */
public class DiceRoller {

    private static final String ROLL_STRING_REGEX = "\\s*\\d*\\s*d\\s*\\d+(\\s*[+-]\\s*\\d+\\s*)*";

    private Integer numDice;
    private Integer numSides;
    private List<Integer> undefinedModifiers;

    public DiceRoller(Integer numDice, Integer numSides, List<Integer> undefinedModifiers){
        this.numDice = numDice;
        this.numSides = numSides;
        this.undefinedModifiers = undefinedModifiers != null ? undefinedModifiers : new ArrayList<>();
    }

    public static DiceRoller createDiceRoller(String rollString) throws RollStringParseException {
        if(!isValidRollString(rollString)){
            throw new RollStringParseException(rollString + " does not match roller regex " + ROLL_STRING_REGEX);
        }
        String rollStringWithoutSpaces = rollString.replaceAll("\\s+", "");
        String dicePart;
        List<Integer> undefinedModifiers = null;
        boolean doesContainModifiers = Pattern.compile("[+-]").matcher(rollStringWithoutSpaces).find();
        if(doesContainModifiers){
            boolean firstIsPlus = rollStringWithoutSpaces.contains("+") &&
                    (!rollStringWithoutSpaces.contains("-") || rollStringWithoutSpaces.indexOf("+") < rollStringWithoutSpaces.indexOf("-"));
            String modifiersSubString = null;
            if(firstIsPlus){
                modifiersSubString = rollStringWithoutSpaces.substring(rollStringWithoutSpaces.indexOf("+"));
                dicePart = rollStringWithoutSpaces.substring(0, rollStringWithoutSpaces.indexOf("+"));
            } else {
                modifiersSubString = rollStringWithoutSpaces.substring(rollStringWithoutSpaces.indexOf("-"));
                dicePart = rollStringWithoutSpaces.substring(0, rollStringWithoutSpaces.indexOf("-"));
            }
            undefinedModifiers = extractModifiersFromModifierSubstring(modifiersSubString);
        } else {
            dicePart = rollStringWithoutSpaces;
        }
        String[] numDiceAndNumSides = dicePart.split("d");
        Integer numDice = numDiceAndNumSides[0].isEmpty() ? 1 : Integer.parseInt(numDiceAndNumSides[0]);
        Integer numSides = Integer.parseInt(numDiceAndNumSides[1]);
        return new DiceRoller(numDice, numSides, undefinedModifiers);
    }

    private static List<Integer> extractModifiersFromModifierSubstring(String modifiersSubString){
        List<Integer> modifieres = new ArrayList<>();
        Matcher matcher = Pattern.compile("[+-]\\d+").matcher(modifiersSubString);
        while(matcher.find()){
            String mod = matcher.group();
            modifieres.add(Integer.parseInt(mod));
        }
        return modifieres;
    }

    private static boolean isValidRollString(String rollString){
        return rollString.matches(ROLL_STRING_REGEX);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder().append(this.numDice);
        sb.append("d");
        sb.append(this.numSides);
        for(Integer i : this.undefinedModifiers){
            if(i > 0){
                sb.append("+").append(i);
            } else {
                sb.append(i);
            }
        }
        return sb.toString();
    }
}

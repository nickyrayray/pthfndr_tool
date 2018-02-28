package nick.pfinder.model.formula.impl;

import nick.pfinder.model.formula.api.Formula;
import nick.pfinder.model.formula.api.Result;
import nick.pfinder.util.rolling.DiceRoller;
import nick.pfinder.util.rolling.Roll;
import nick.pfinder.util.rolling.RollStringParseException;

import java.util.stream.Collectors;

/**
 * Created by nickyrayray on 2/27/18.
 */
public class RolledNumber implements Formula{

    private DiceRoller diceRoller;
    private String description;
    private boolean conditional;

    public RolledNumber(String rollString, String description, boolean conditional){
        try {
            this.diceRoller = DiceRoller.createDiceRoller(rollString);
            this.description = description;
            this.conditional = conditional;
        } catch (RollStringParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Result evaluate() {
        Roll roll = diceRoller.roll();
        String rollResultDescription = String.format("Rolling %s: %s +%s",
                roll.getRollString(),
                roll.getRollResults().stream().map(Object::toString).collect(Collectors.joining("+")),
                roll.getUndefinedModifiers().stream().map(Object::toString).collect(Collectors.joining("+")));

        return new Result().withComponent(description + ". " + rollResultDescription, roll.getResult(), conditional);
    }

    @Override
    public void addToFormula(Formula formula) {}
}

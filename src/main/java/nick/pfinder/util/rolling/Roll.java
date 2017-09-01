package nick.pfinder.util.rolling;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nickyrayray on 8/26/17.
 */
public class Roll {

    List<Integer> rolls;

    public Roll(List<Integer> rolls){
        this.rolls = rolls;
    }

    public Roll(){
        this.rolls = new ArrayList<>();
    }

    public Roll withRoll(Integer amount){
        this.rolls.add(amount);
        return this;
    }

    public Roll withRolls(List<Integer> amounts){
        this.rolls.addAll(amounts);
        return this;
    }

}

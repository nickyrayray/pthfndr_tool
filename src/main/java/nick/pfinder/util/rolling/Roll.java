package nick.pfinder.util.rolling;

import java.util.List;

/**
 * Created by nickyrayray on 2/27/18.
 */
public class Roll {

    private List<Integer> rollResults;
    private List<Integer> undefinedModifiers;
    private String rollString;
    private Integer result;

    public Roll(List<Integer> rollResults, List<Integer> undefinedModifiers, String rollString){
        this.rollResults = rollResults;
        this.undefinedModifiers = undefinedModifiers;
        this.rollString = rollString;
    }

    public List<Integer> getRollResults() {
        return rollResults;
    }

    public List<Integer> getUndefinedModifiers() {
        return undefinedModifiers;
    }

    public String getRollString() {
        return rollString;
    }

    public Integer getResult(){
        if(this.result == null){
            this.result = rollResults.stream().mapToInt(Integer::intValue).sum()
                    + undefinedModifiers.stream().mapToInt(Integer::intValue).sum();
        }
        return result;
    }
}

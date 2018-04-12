package nick.pfinder.model.formula.api;

/**
 * Created by nickyrayray on 2/22/18.
 */
public interface Formula {

    Result evaluate();

    void addToFormula(Formula formula);


}

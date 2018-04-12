package nick.pfinder.model.formula.impl;

import nick.pfinder.model.formula.api.Formula;
import nick.pfinder.model.formula.api.Result;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nickyrayray on 2/27/18.
 */
public class FormulaImpl implements Formula{

    private List<Formula> formulas;
    private String desc;

    public FormulaImpl(List<Formula> formulas){
        this.formulas = formulas;
    }

    @Override
    public Result evaluate() {
        return formulas
                .stream()
                .map(Formula::evaluate)
                .reduce(new Result(), Result::appendResult);
    }

    @Override
    public void addToFormula(Formula formula) {
        formulas.add(formula);
    }

}

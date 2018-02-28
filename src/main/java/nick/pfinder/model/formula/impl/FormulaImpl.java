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

    public FormulaImpl(String desc){
        this.formulas = new ArrayList<>();
        this.desc = desc;
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

    public static void main(String[] args) {
        Formula formula1 = new Number("formula1", 1);
        Formula formula2 = new Number("formula2", 2);
        Formula formulaCompilation = new FormulaImpl("formula total");
        formulaCompilation.addToFormula(formula1);
        formulaCompilation.addToFormula(formula2);
        Result res = formulaCompilation.evaluate();
        System.out.println(res);
    }
}

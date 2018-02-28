package nick.pfinder.model.formula.impl;

import nick.pfinder.model.formula.api.Formula;
import nick.pfinder.model.formula.api.Result;

/**
 * Created by nickyrayray on 2/27/18.
 */
public class Number implements Formula{

    private Integer value;
    private String name;
    private boolean conditional;

    public Number(String name, Integer value){
        this.name = name;
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Result evaluate() {
        return new Result().withComponent(name, value, conditional);
    }

    @Override
    public void addToFormula(Formula formula) {}
}

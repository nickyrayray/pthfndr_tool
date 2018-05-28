package nick.pfinder.model.formula.api;

import nick.pfinder.model.formula.exception.OperatorNotSupportedException;

public enum Operator {
    Add("+"),
    Subtract("-"),
    Multiply("*"),
    Divide("/");

    String representation;

    Operator(String representation){
        this.representation = representation;
    }

    static Operator getOperatorFromStringRep(String rep) throws OperatorNotSupportedException {
        for(Operator operator : Operator.values()){
            if(operator.representation.equals(rep)){
                return operator;
            }
        }
        throw new OperatorNotSupportedException(rep);
    }

}

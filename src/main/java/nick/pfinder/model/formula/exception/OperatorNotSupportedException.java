package nick.pfinder.model.formula.exception;

import nick.pfinder.model.formula.api.Operator;

public class OperatorNotSupportedException extends Exception {

    public OperatorNotSupportedException(String representation){
        super(String.format("%s operator not supported", representation));
    }
}

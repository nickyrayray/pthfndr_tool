package nick.pfinder.model.formula;

import java.util.Arrays;

/**
 * Created by nickyrayray on 4/8/18.
 */
public class FormulaParser {

    public static final String OPERATOR_REGEX = "[+-/*]";
    public static final String BINARY_OPERATOR_FORMULA_REGEX = "(.+" + OPERATOR_REGEX + ".+)+";

    public static void parse(String formula){
        if(hasOperators(formula)){

        }
    }

    private static boolean hasMultipleComponents = ""

    private static boolean hasOperators(String formula){
        formula = formula.replaceAll("\\s+", "");
        return formula.matches(BINARY_OPERATOR_FORMULA_REGEX);
    }

}

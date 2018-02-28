package nick.pfinder.model.formula.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nickyrayray on 2/22/18.
 */
public class Result {

    private Integer total;
    private List<ResultComponent> results;

    public Result(){
        total = 0;
        results = new ArrayList<>();
    }

    public Result withComponent(String desc, Integer value, boolean conditional){
        ResultComponent rc = new ResultComponent(desc, value, conditional);
        results.add(rc);
        return this;
    }

    public Result appendResult(Result result){
        results.addAll(result.results);
        total += result.total;
        return this;
    }


    class ResultComponent {

        private String desc;
        private Integer value;
        private boolean conditional;

        public ResultComponent(String desc, Integer value, boolean conditional){
            this.desc = desc;
            this.value = value;
            this.conditional = conditional;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public boolean isConditional() {
            return conditional;
        }

        public void setConditional(boolean conditional) {
            this.conditional = conditional;
        }
    }

}

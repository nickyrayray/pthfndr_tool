package nick.pfinder.model.items;

/**
 * Created by nickyrayray on 8/24/17.
 */
public class Item {

    private Integer weight;
    private String name;
    private Integer cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

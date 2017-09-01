package nick.pfinder.util;

/**
 * Created by nickyrayray on 8/26/17.
 */
public class Range {

    private Integer top;
    private Integer bottom;

    public Range(Integer bottom, Integer top){
        this.top = top;
        this.bottom = bottom;
    }

    public boolean isInRange(Integer number){
        return number >= this.bottom && number <= this.top;
    }
}

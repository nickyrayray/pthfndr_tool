package nick.pfinder.model.items.money;

/**
 * Created by nickyrayray on 8/26/17.
 */
public class Price {

    public Integer amount;
    public Currency currency;

    public Price(Integer amount, Currency currency){
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

}

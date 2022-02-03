package spring.love.calculator.api;

import java.math.BigDecimal;

public class Amount {

    // The Class properties
    private BigDecimal billAmount;
    private String localeDefinition;


    // Created the setter and Getter
    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public String getLocaleDefinition() {
        return localeDefinition;
    }

    public void setLocaleDefinition(String localeDefinition) {
        this.localeDefinition = localeDefinition;
    }
}

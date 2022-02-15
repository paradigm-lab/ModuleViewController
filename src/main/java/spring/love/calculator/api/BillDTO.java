package spring.love.calculator.api;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

public class BillDTO {

    // The class property
    private CreditCard card;
    private Date date;
    private Currency currency;
    private BigDecimal amount;

    // Getter and setter Methods
    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

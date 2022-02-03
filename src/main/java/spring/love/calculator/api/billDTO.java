package spring.love.calculator.api;

public class billDTO {

    // The class property
    private CreditCard card;
    private Amount amount;

    // Getter and Setter method
    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}

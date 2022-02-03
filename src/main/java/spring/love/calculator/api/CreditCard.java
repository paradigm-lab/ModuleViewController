package spring.love.calculator.api;

public class CreditCard {

    // The Property or fields for my class
    private Integer firstFourDigits;
    private Integer secondFourDigits;
    private Integer thirdFourDigits;
    private Integer lastFourDigits;


    // The getter and setter method
    public Integer getFirstFourDigits() {
        return firstFourDigits;
    }

    public void setFirstFourDigits(Integer firstFourDigits) {
        this.firstFourDigits = firstFourDigits;
    }

    public Integer getSecondFourDigits() {
        return secondFourDigits;
    }

    public void setSecondFourDigits(Integer secondFourDigits) {
        this.secondFourDigits = secondFourDigits;
    }

    public Integer getThirdFourDigits() {
        return thirdFourDigits;
    }

    public void setThirdFourDigits(Integer thirdFourDigits) {
        this.thirdFourDigits = thirdFourDigits;
    }

    public Integer getLastFourDigits() {
        return lastFourDigits;
    }

    public void setLastFourDigits(Integer lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }
}

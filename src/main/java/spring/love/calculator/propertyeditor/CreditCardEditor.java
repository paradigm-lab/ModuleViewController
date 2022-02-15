package spring.love.calculator.propertyeditor;

import spring.love.calculator.api.CreditCard;

import java.beans.PropertyEditorSupport;

public class CreditCardEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        CreditCard creditCard = (CreditCard)getValue();
        return "Sample : " + creditCard;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        // Split the String values with the split method and store in the string array
        String[] digitsArray = text.split("-");

        // Setting Credit card Values
        CreditCard creditCard = new CreditCard();

        creditCard.setFirstFourDigits(Integer.valueOf(digitsArray[0]));
        creditCard.setSecondFourDigits(Integer.valueOf(digitsArray[1]));
        creditCard.setThirdFourDigits(Integer.valueOf(digitsArray[2]));
        creditCard.setLastFourDigits(Integer.valueOf(digitsArray[3]));

        // Returning Credit card Object
        setValue(creditCard);
    }
}

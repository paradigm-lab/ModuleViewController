package spring.love.calculator.converters;

import org.springframework.core.convert.converter.Converter;
import spring.love.calculator.api.CreditCard;

public class CreditCardConverter implements Converter<String, CreditCard> {
    @Override
    public CreditCard convert(String source) {
        // Split the String values by using the hyphen and store into the String array
        String[] digitsArray = source.split("-");

        // Setting Credit card values
        CreditCard creditCard = new CreditCard();

        creditCard.setFirstFourDigits(Integer.valueOf(digitsArray[0]));
        creditCard.setSecondFourDigits(Integer.valueOf(digitsArray[1]));
        creditCard.setThirdFourDigits(Integer.valueOf(digitsArray[2]));
        creditCard.setLastFourDigits(Integer.valueOf(digitsArray[3]));

        return creditCard;
    }
}

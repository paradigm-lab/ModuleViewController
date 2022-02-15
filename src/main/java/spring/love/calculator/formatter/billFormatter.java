package spring.love.calculator.formatter;

import org.springframework.format.Formatter;
import spring.love.calculator.api.BillDTO;
import spring.love.calculator.api.CreditCard;

import java.text.ParseException;
import java.util.Locale;

public class billFormatter implements Formatter<CreditCard> {

    @Override
    public CreditCard parse(String text, Locale locale) throws ParseException {

        // Splitting the credit Card
        String[] digitsArray = text.split("-");

        // Setting credit card values
        CreditCard creditCard = new CreditCard();

        // Setting the values to the DTO class using the digitsArray
        creditCard.setFirstFourDigits(Integer.valueOf(digitsArray[0]));
        creditCard.setSecondFourDigits(Integer.valueOf(digitsArray[1]));
        creditCard.setThirdFourDigits(Integer.valueOf(digitsArray[2]));
        creditCard.setLastFourDigits(Integer.valueOf(digitsArray[3]));

        // Returning the Credit card objects
        return creditCard;

    }

    @Override
    public String print(CreditCard object, Locale locale) {
        return null;
    }
}

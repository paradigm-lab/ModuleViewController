package spring.love.calculator.formatter;

import org.springframework.format.Formatter;
import spring.love.calculator.api.BillDTO;
import spring.love.calculator.api.CreditCard;

import java.text.ParseException;
import java.util.Locale;

public class billFormatter implements Formatter<CreditCard> {

    @Override
    public CreditCard parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(CreditCard object, Locale locale) {
        return null;
    }
}

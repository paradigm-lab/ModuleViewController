package spring.love.calculator.formatter;

import org.springframework.format.Formatter;
import spring.love.calculator.api.Phone;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<Phone> {

    @Override
    public Phone parse(String text, Locale locale) throws ParseException {

        System.out.println("Inside the parse method of the PhoneNumberFormatter");

        // Logic

        return null;
    }

    @Override
    public String print(Phone object, Locale locale) {
        return null;
    }

}

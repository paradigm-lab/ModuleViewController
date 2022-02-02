package spring.love.calculator.formatter;

import org.springframework.format.Formatter;
import spring.love.calculator.api.Phone;

import java.text.ParseException;
import java.util.Locale;

public class PhoneNumberFormatter implements Formatter<Phone> {

    @Override
    public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

        System.out.println("Inside the parse method of the PhoneNumberFormatter");

        // Logic
        // Split the String received from the user
        String[] phoneNumberArray = completePhoneNumber.split("-");

        // Extract the countryCode and set it to the phone class countryCodeProperty
        Phone phone = new Phone();
        phone.setCountryCode(phoneNumberArray[0]);
        phone.setUserNumber(phoneNumberArray[1]);

        return phone;
    }

    @Override
    public String print(Phone object, Locale locale) {

        System.out.println("Inside the print method of the phoneNumberFormatter");

        return null;
    }

}

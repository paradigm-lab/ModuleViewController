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
        Phone phone = new Phone();

        // Split the String received from the user
        String[] phoneNumberArray = completePhoneNumber.split("-");

        // Whether the number consist of "-"
        int index = completePhoneNumber.indexOf('-');

        // If the string doesn't have a "-" or start with a "-" add 91 before it
        if (index == -1 || completePhoneNumber.startsWith("-")) {

            // If the '-' is not found, then add 255 as the default country code
            phone.setCountryCode("255");

            if (completePhoneNumber.startsWith("-")) {
                phone.setUserNumber(phoneNumberArray[1]);
            }   else {
                phone.setUserNumber(phoneNumberArray[0]);
            }


        }   else {

            // Extract the countryCode and set it to the phone class countryCodeProperty
            phone.setCountryCode(phoneNumberArray[0]);
            phone.setUserNumber(phoneNumberArray[1]);
        }

        return phone;
    }

    @Override
    public String print(Phone phone, Locale locale) {

        System.out.println("Inside the print method of the phoneNumberFormatter");

        return phone.getCountryCode() + "-" + phone.getUserNumber();
    }

}

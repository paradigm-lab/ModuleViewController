package spring.love.calculator.converters;

import org.springframework.core.convert.converter.Converter;
import spring.love.calculator.api.CreditCard;

public class CreditConverterObjectToString implements Converter<CreditCard, String> {

    @Override
    public String convert(CreditCard source) {



        return "Sample" + source.getFirstFourDigits();
    }
}

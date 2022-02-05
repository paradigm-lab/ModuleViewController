package spring.love.calculator.formatter;

import org.springframework.format.Formatter;
import spring.love.calculator.api.BillDTO;

import java.text.ParseException;
import java.util.Locale;

public class billFormatter implements Formatter<BillDTO> {
    @Override
    public BillDTO parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(BillDTO object, Locale locale) {
        return null;
    }
}

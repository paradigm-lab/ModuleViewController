package spring.love.calculator.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmailValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}

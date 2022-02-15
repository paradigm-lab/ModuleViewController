package spring.love.calculator.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserNameValidator implements Validator {

    // Check if the UserNameValidator supports a given object
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    // We need to write our customer validation logic
    @Override
    public void validate(Object target, Errors errors) {

    }
}

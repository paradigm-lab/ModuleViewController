package spring.love.calculator.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import spring.love.calculator.api.UserRegistrationDTO;

public class EmailValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {

        return UserRegistrationDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.Email", "email.empty");

    }
}

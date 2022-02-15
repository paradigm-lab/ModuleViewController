package spring.love.calculator.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import spring.love.calculator.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

    // Check if the UserNameValidator supports a given object
    @Override
    public boolean supports(Class<?> clazz) {

        return UserRegistrationDTO.class.equals(clazz);
    }

    // We need to write our customer validation logic
    @Override
    public void validate(Object object, Errors errors) {
        // To Check if the field is null
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "User name can't be empty");

        // The String should Contain a _
        String userName = ((UserRegistrationDTO)object).getUserName();

        if (!userName.contains("_")){
            errors.rejectValue("userName", "userName.InvalidString", "String must contain a '_' ");
        }
    }
}

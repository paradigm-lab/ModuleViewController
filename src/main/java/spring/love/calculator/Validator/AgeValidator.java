package spring.love.calculator.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        // Writing my logic here

        return false;
    }
}
